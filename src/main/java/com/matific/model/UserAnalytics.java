package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * The type User analytics.
 */
public class UserAnalytics implements Serializable {

    @JsonProperty("live_user_count")
    private int numberOfLiveUsers;
    @JsonProperty("loggedin_user_count")
    private int numberOfLoggedinUsers;
    @JsonProperty("user_activity")
    private List<UserActivity> userActivities;

    /**
     * Instantiates a new User analytics.
     *
     * @param numberOfLiveUsers     the number of live users
     * @param numberOfLoggedinUsers the number of loggedin users
     * @param userActivities        the user activities
     */
    public UserAnalytics(int numberOfLiveUsers, int numberOfLoggedinUsers, List<UserActivity> userActivities) {
        this.numberOfLiveUsers = numberOfLiveUsers;
        this.numberOfLoggedinUsers = numberOfLoggedinUsers;
        this.userActivities = userActivities;
    }

    /**
     * Instantiates a new User analytics.
     */
    public UserAnalytics() {
    }

    /**
     * Gets number of live users.
     *
     * @return the number of live users
     */
    public int getNumberOfLiveUsers() {
        return numberOfLiveUsers;
    }

    /**
     * Sets number of live users.
     *
     * @param numberOfLiveUsers the number of live users
     */
    public void setNumberOfLiveUsers(int numberOfLiveUsers) {
        this.numberOfLiveUsers = numberOfLiveUsers;
    }

    /**
     * Gets number of loggedin users.
     *
     * @return the number of loggedin users
     */
    public int getNumberOfLoggedinUsers() {
        return numberOfLoggedinUsers;
    }

    /**
     * Sets number of loggedin users.
     *
     * @param numberOfLoggedinUsers the number of loggedin users
     */
    public void setNumberOfLoggedinUsers(int numberOfLoggedinUsers) {
        this.numberOfLoggedinUsers = numberOfLoggedinUsers;
    }

    /**
     * Gets user activities.
     *
     * @return the user activities
     */
    public List<UserActivity> getUserActivities() {
        return userActivities;
    }

    /**
     * Sets user activities.
     *
     * @param userActivities the user activities
     */
    public void setUserActivities(List<UserActivity> userActivities) {
        this.userActivities = userActivities;
    }
}
