package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * The type User activity.
 */
public class UserActivity implements Serializable {

    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("system_usage")
    private float timeSpent;

    /**
     * Instantiates a new User activity.
     *
     * @param userName  the user name
     * @param timeSpent the time spent
     */
    public UserActivity(String userName, float timeSpent) {
        this.userName = userName;
        this.timeSpent = timeSpent;
    }

    /**
     * Instantiates a new User activity.
     */
    public UserActivity() {
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

    /**
     * Gets time spent.
     *
     * @return the time spent
     */
    public float getTimeSpent() {
        return timeSpent;
    }

    /**
     * Sets time spent.
     *
     * @param timeSpent the time spent
     */
    public void setTimeSpent(float timeSpent) {
        this.timeSpent = timeSpent;
    }

}
