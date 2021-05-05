package com.matific.service.impl;


import com.matific.entity.RoleEntity;
import com.matific.entity.TokenEntity;
import com.matific.entity.UserEntity;
import com.matific.exception.UserCreationException;
import com.matific.exception.UserLogOutException;
import com.matific.exception.UserLoginException;
import com.matific.model.Role;
import com.matific.model.User;
import com.matific.repository.TokenRepository;
import com.matific.repository.UserRepository;
import com.matific.service.UserAccessService;
import com.matific.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type User access service.
 */
@Service
public class UserAccessServiceImpl implements UserAccessService {

    /**
     * The Token repository.
     */
    @Autowired
    TokenRepository tokenRepository;

    /**
     * The User repository.
     */
    @Autowired
    UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    private final String ROLE_USER = "ROLE_PLAYER";

    @Override
    @Transactional
    public String logoutUser(User user) throws UserLogOutException {
        final String sessionId = jwtTokenUtil.extractSessionId(user.getJwt());
        int disableUser = userRepository.deactivateUserByName(user.getUserName());
        TokenEntity tokenEntity = tokenRepository.findTokenBySessionId(sessionId);
        tokenEntity.setEnable(Boolean.FALSE);
        tokenEntity.setLogoutDate(new Date());
        long diff = tokenEntity.getLogoutDate().getTime() - tokenEntity.getLoginDate().getTime();
        tokenEntity.setSpentTime((diff / (1000)));
        tokenEntity = tokenRepository.saveAndFlush(tokenEntity);

        if (disableUser == 1 && tokenEntity.isEnable() == false) {
            return "User Logout successfully";
        }
        return "User Logout Error";
    }

    @Override
    public User signUpUser(User user) throws UserCreationException {
        UserEntity userEntity = userRepository.findUserByUserName(user.getUserName());
        if (null != userEntity) {
            throw new UserCreationException ("User already exist");
        }
        userEntity = new UserEntity(user.getUserName(), user.getPassword(),
                user.getEmail(), Boolean.TRUE, Boolean.FALSE);
        List<RoleEntity> roleEntities = Arrays.asList(new RoleEntity(ROLE_USER));
        userEntity.setRoles(roleEntities);
        UserEntity userEntityRes = userRepository.save(userEntity);
        return new User(userEntityRes.getUserName(), "", userEntityRes.getEmail());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findUserByUserName(username);
        return new User(userEntity.getUserName(),
                userEntity.getPassword(),
                userEntity.getEnable(),
                userEntity.getRoles().stream()
                        .map(roleEntity -> new Role(roleEntity.getName()))
                        .collect(Collectors.toList()), userEntity.getActive());
    }

    @Override
    public User loadUserByUsername(UserDetails userDetails) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findUserByUserName(userDetails.getUsername());
        return new User(userEntity.getUserName(),
                userEntity.getPassword(),
                userEntity.getEnable(),
                userEntity.getRoles().stream()
                        .map(roleEntity -> new Role(roleEntity.getName()))
                        .collect(Collectors.toList()), userEntity.getActive());
    }

    @Override
    @Transactional
    public User loginUser(User user) throws UserLoginException {
        UserEntity userEntity = userRepository.findUserByUserName(user.getUserName());
        if (null == userEntity) {
            throw new UserLoginException ("No user found " + userEntity.getUserName());
        } else if (null != userEntity && userEntity.getActive()) {
            throw new UserLoginException ("User already logged in " + userEntity.getUserName());
        }
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        userRepository.activateUserByName(user.getUserName());
        final String jwt = jwtTokenUtil.generateToken(user);
        final String sessionId = jwtTokenUtil.extractSessionId(jwt);
        TokenEntity tokenEntity = tokenRepository
                .save(new TokenEntity(jwt, Boolean.TRUE, userEntity.getUserName(),
                        sessionId, new Date(), null, 0));

        User userRes = new User(userEntity.getUserName(),"", userEntity.getEmail());
        userRes.setJwt(tokenEntity.getJwt());
        return userRes;
    }
}
