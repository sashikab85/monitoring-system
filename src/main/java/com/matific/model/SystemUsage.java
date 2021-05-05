package com.matific.model;


/**
 * The interface System usage.
 */
public interface SystemUsage {
    /**
     * Gets user name.
     *
     * @return the user name
     */
    String getUserName();

    /**
     * Gets time spent.
     *
     * @return the time spent
     */
    float getTimeSpent();

    /**
     * Gets member identification number.
     *
     * @return the member identification number
     */
    String getMemberIdentificationNumber();


    /**
     * The constant userName.
     */
    String userName = "";
    /**
     * The constant timeSpent.
     */
    float timeSpent = 0F;
    /**
     * The constant memberIdentificationNumber.
     */
    String memberIdentificationNumber = "";
}