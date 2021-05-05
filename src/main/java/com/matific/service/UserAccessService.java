package com.matific.service;


import com.matific.exception.UserCreationException;
import com.matific.exception.UserLogOutException;
import com.matific.exception.UserLoginException;
import com.matific.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * The interface User access service.
 */
public interface UserAccessService extends UserDetailsService {

    /**
     * Sign up user user.
     *
     * @param user the user
     * @return the user
     * @throws UserCreationException the user creation exception
     */
    User signUpUser(User user) throws UserCreationException;

    /**
     * Logout user string.
     *
     * @param user the user
     * @return the string
     * @throws UserLogOutException the user log out exception
     */
    String logoutUser(User user) throws UserLogOutException;

    /**
     * Login user user.
     *
     * @param user the user
     * @return the user
     * @throws UserLoginException the user login exception
     */
    User loginUser(User user) throws UserLoginException;

    /**
     * Load user by username user.
     *
     * @param userDetails the user details
     * @return the user
     */
    User loadUserByUsername(UserDetails userDetails);
}
