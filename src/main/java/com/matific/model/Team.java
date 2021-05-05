package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Team.
 */
public class Team {

    @JsonProperty("id")
    private Integer teamAnalyticId;

    @JsonProperty("name")
    private String teamName;

    @JsonProperty("tin")
    private String teamIdentificationNumber;

    @JsonProperty("score")
    private double teamScore;

    @JsonProperty("score avg")
    private double teamScoreAvg;

    /**
     * Instantiates a new Team.
     *
     * @param teamAnalyticId           the team analytic id
     * @param teamName                 the team name
     * @param teamIdentificationNumber the team identification number
     * @param teamScore                the team score
     * @param teamScoreAvg             the team score avg
     */
    public Team(Integer teamAnalyticId, String teamName, String teamIdentificationNumber, double teamScore, double teamScoreAvg) {
        this.teamAnalyticId = teamAnalyticId;
        this.teamName = teamName;
        this.teamIdentificationNumber = teamIdentificationNumber;
        this.teamScore = teamScore;
        this.teamScoreAvg = teamScoreAvg;
    }

    /**
     * Instantiates a new Team.
     *
     * @param teamAnalyticId           the team analytic id
     * @param teamName                 the team name
     * @param teamIdentificationNumber the team identification number
     */
    public Team(Integer teamAnalyticId, String teamName, String teamIdentificationNumber) {
        this.teamAnalyticId = teamAnalyticId;
        this.teamName = teamName;
        this.teamIdentificationNumber = teamIdentificationNumber;
    }

    /**
     * Instantiates a new Team.
     */
    public Team() {
    }

    /**
     * Gets team analytic id.
     *
     * @return the team analytic id
     */
    public Integer getTeamAnalyticId() {
        return teamAnalyticId;
    }

    /**
     * Sets team analytic id.
     *
     * @param teamAnalyticId the team analytic id
     */
    public void setTeamAnalyticId(Integer teamAnalyticId) {
        this.teamAnalyticId = teamAnalyticId;
    }

    /**
     * Gets team name.
     *
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets team name.
     *
     * @param teamName the team name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Gets team identification number.
     *
     * @return the team identification number
     */
    public String getTeamIdentificationNumber() {
        return teamIdentificationNumber;
    }

    /**
     * Sets team identification number.
     *
     * @param teamIdentificationNumber the team identification number
     */
    public void setTeamIdentificationNumber(String teamIdentificationNumber) {
        this.teamIdentificationNumber = teamIdentificationNumber;
    }

    /**
     * Gets team score.
     *
     * @return the team score
     */
    public double getTeamScore() {
        return teamScore;
    }

    /**
     * Sets team score.
     *
     * @param teamScore the team score
     */
    public void setTeamScore(double teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * Gets team score avg.
     *
     * @return the team score avg
     */
    public double getTeamScoreAvg() {
        return teamScoreAvg;
    }

    /**
     * Sets team score avg.
     *
     * @param teamScoreAvg the team score avg
     */
    public void setTeamScoreAvg(double teamScoreAvg) {
        this.teamScoreAvg = teamScoreAvg;
    }
}
