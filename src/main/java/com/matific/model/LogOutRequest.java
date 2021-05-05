package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Log out request.
 */
public class LogOutRequest {

    @JsonProperty("username")
    private String userName;

    /**
     * Instantiates a new Log out request.
     *
     * @param userName the user name
     */
    public LogOutRequest(String userName) {
        this.userName = userName;
    }

    /**
     * Instantiates a new Log out request.
     */
    public LogOutRequest() {
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
