package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Teams info.
 */
public class TeamsInfo {

    @JsonProperty("id")
    private Integer teamAnalyticId;

    @JsonProperty("name")
    private String teamName;

    @JsonProperty("tin")
    private String teamIdentificationNumber;

    /**
     * Instantiates a new Teams info.
     *
     * @param teamAnalyticId           the team analytic id
     * @param teamName                 the team name
     * @param teamIdentificationNumber the team identification number
     */
    public TeamsInfo(Integer teamAnalyticId, String teamName, String teamIdentificationNumber) {
        this.teamAnalyticId = teamAnalyticId;
        this.teamName = teamName;
        this.teamIdentificationNumber = teamIdentificationNumber;
    }

    /**
     * Instantiates a new Teams info.
     */
    public TeamsInfo() {
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
}
