package com.matific.model;

/**
 * The type Sign up response.
 */
public class SignUpResponse {
    private String message;

    /**
     * Instantiates a new Sign up response.
     *
     * @param message the message
     */
    public SignUpResponse(String message) {
        this.message = message;
    }

    /**
     * Instantiates a new Sign up response.
     */
    public SignUpResponse() {
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
}
