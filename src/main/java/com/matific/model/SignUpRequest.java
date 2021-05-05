package com.matific.model;


/**
 * The type Sign up request.
 */
public class SignUpRequest {

    private String username;
    private String password;
    private String email;

    /**
     * Instantiates a new Sign up request.
     *
     * @param username the username
     * @param password the password
     * @param email    the email
     */
    public SignUpRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * Instantiates a new Sign up request.
     *
     * @param username the username
     * @param password the password
     */
    public SignUpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Instantiates a new Sign up request.
     */
    public SignUpRequest() {
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }


}
