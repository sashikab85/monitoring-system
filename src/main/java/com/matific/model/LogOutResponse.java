package com.matific.model;

/**
 * The type Log out response.
 */
public class LogOutResponse {

    private String message;

    /**
     * Instantiates a new Log out response.
     *
     * @param message the message
     */
    public LogOutResponse(String message) {
        this.message = message;
    }

    /**
     * Instantiates a new Log out response.
     */
    public LogOutResponse() {
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
