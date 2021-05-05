package com.matific.entity;

/**
 * The interface Team avg entity.
 */
public interface TeamAvgEntity {
    /**
     * The constant tin.
     */
    public String tin = null;
    /**
     * The constant avg.
     */
    public double avg = 0.0;
    public double teamTotal = 0.0;

    public double getTeamTotal ();
    /**
     * Gets tin.
     *
     * @return the tin
     */
    public String getTin();

    /**
     * Gets avg.
     *
     * @return the avg
     */
    public double getAvg();
}
