package com.matific.controller;

import com.matific.exception.UserCreationException;
import com.matific.exception.UserLogOutException;
import com.matific.exception.UserLoginException;
import com.matific.model.*;
import com.matific.service.UserAccessService;
import com.matific.util.JwtUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * The type User access controller.
 */
@RestController
@RequestMapping(path = "user")
public class UserAccessController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserAccessService logOutService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserAccessService userAccessService;

    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(UserAccessController.class);

    /**
     * Sign up response entity.
     * create user for the system usages
     *
     * @param signupRequest the signup request
     * @return the response entity
     */

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<SignUpResponse> signUp(@RequestBody SignUpRequest signupRequest) {
        logger.info(" >>>>>>>> signup request for user : " + signupRequest.getUsername());
        User userInfo = new User(signupRequest.getUsername(), signupRequest.getPassword(), signupRequest.getEmail());
        User user = null;
        try {
            user = userAccessService.signUpUser(userInfo);
        } catch (UserCreationException e) {
            logger.info(" >>>>>>>> error on signup request for user : " + signupRequest.getUsername() + " >>>>>>>>> " + e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new SignUpResponse(e.getMessage()));
        }
        logger.info(">>>>>>>> user created successfully : " + user.toString());
        return ResponseEntity.ok(new SignUpResponse("Created new user: " + user.getUserName()));
    }

    /**
     * Login response entity.
     * user logging endpoint
     *
     * @param loginRequest the login request
     * @return the response entity
     */

    @RequestMapping(value = "/login", method = RequestMethod.PUT)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        logger.info(" >>>>>>>> login request for user : " + loginRequest.getUsername());
        User userInfo = new User(loginRequest.getUsername(), loginRequest.getPassword(), loginRequest.getEmail());
        try {
            userInfo = userAccessService.loginUser(userInfo);
        } catch (UserLoginException e) {
            logger.info(" >>>>>>>> error on login request for user : " + loginRequest.getUsername() + " >>>>>>> " + e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new LoginResponse("jwt-error", e.getMessage()));
        }
        logger.info(">>>>>>>> user login successfully : " + userInfo.toString());
        return ResponseEntity.ok(new LoginResponse(userInfo.getJwt(), "User successfully logged in !"));
    }

    /**
     * Logout response entity.
     * user logout endpoint
     *
     * @param request       the request
     * @param logOutRequest the log out request
     * @return the response entity
     */
    @RequestMapping(value = "/logout", method = RequestMethod.PUT)
    public ResponseEntity<LogOutResponse> logout(HttpServletRequest request, @RequestBody LogOutRequest logOutRequest) {
        logger.info(" >>>>>>>> log out request for user : " + logOutRequest.getUserName());
        final String authorizationHeader = request.getHeader("Authorization");
        String jwt = null;
        String logOutMsg = "";
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new LogOutResponse("No authorization token found !"));
        }
        User user = new User(logOutRequest.getUserName());
        user.setJwt(jwt);
        try {
            logOutMsg = logOutService.logoutUser(user);
        } catch (UserLogOutException e) {
            logger.info(" >>>>>>>> error on log out request for user : " + logOutRequest.getUserName() + " >>>>>> " + e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new LogOutResponse(e.getMessage()));
        }
        logger.info(" >>>>>>>> log out request successful : " + logOutRequest.getUserName());
        return ResponseEntity.ok(new LogOutResponse(logOutMsg));
    }
}
