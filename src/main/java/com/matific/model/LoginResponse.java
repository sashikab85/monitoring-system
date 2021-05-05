package com.matific.model;

/**
 * The type Login response.
 */
public class LoginResponse {
    private String message;
    private String jwt;


    /**
     * Instantiates a new Login response.
     *
     * @param jwt     the jwt
     * @param message the message
     */
    public LoginResponse(String jwt, String message) {
        this.jwt = jwt;
        this.message = message;
    }

    /**
     * Instantiates a new Login response.
     */
    public LoginResponse() {
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets jwt.
     *
     * @return the jwt
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * Sets jwt.
     *
     * @param jwt the jwt
     */
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }


    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
