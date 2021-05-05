package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Team avg.
 */
public class TeamAvg {

    @JsonProperty("tin")
    private String tin;
    @JsonProperty("score avg")
    private double scoreAvg;

    /**
     * Instantiates a new Team avg.
     *
     * @param tin      the tin
     * @param scoreAvg the score avg
     */
    public TeamAvg(String tin, double scoreAvg) {
        this.tin = tin;
        this.scoreAvg = scoreAvg;
    }

    /**
     * Instantiates a new Team avg.
     */
    public TeamAvg() {
    }

    /**
     * Gets tin.
     *
     * @return the tin
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets tin.
     *
     * @param tin the tin
     */
    public void setTin(String tin) {
        this.tin = tin;
    }

    /**
     * Gets score avg.
     *
     * @return the score avg
     */
    public double getScoreAvg() {
        return scoreAvg;
    }

    /**
     * Sets score avg.
     *
     * @param scoreAvg the score avg
     */
    public void setScoreAvg(double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }
}
