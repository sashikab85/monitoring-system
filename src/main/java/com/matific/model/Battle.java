package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * The type Battle.
 */
public class Battle {

    @JsonProperty("start_date")
    private Date battleStartDate;
    @JsonProperty("starting_time")
    private Date battleStartTime;
    @JsonProperty("ending_time")
    private Date battleEndTime;
    @JsonProperty("winner")
    private String battleWinner;
    @JsonProperty("teams")
    private List<Team> teams;

    /**
     * Instantiates a new Battle.
     *
     * @param battleStartDate the battle start date
     * @param battleStartTime the battle start time
     * @param battleEndTime   the battle end time
     * @param battleWinner    the battle winner
     */
    public Battle(Date battleStartDate, Date battleStartTime, Date battleEndTime, String battleWinner) {
        this.battleStartDate = battleStartDate;
        this.battleStartTime = battleStartTime;
        this.battleEndTime = battleEndTime;
        this.battleWinner = battleWinner;
    }

    public Battle(Date battleStartDate, Date battleStartTime, Date battleEndTime, String battleWinner, List<Team> teams) {
        this.battleStartDate = battleStartDate;
        this.battleStartTime = battleStartTime;
        this.battleEndTime = battleEndTime;
        this.battleWinner = battleWinner;
        this.teams = teams;
    }

    /**
     * Instantiates a new Battle.
     */
    public Battle() {
    }

    /**
     * Gets battle start date.
     *
     * @return the battle start date
     */
    public Date getBattleStartDate() {
        return battleStartDate;
    }

    /**
     * Sets battle start date.
     *
     * @param battleStartDate the battle start date
     */
    public void setBattleStartDate(Date battleStartDate) {
        this.battleStartDate = battleStartDate;
    }

    /**
     * Gets battle start time.
     *
     * @return the battle start time
     */
    public Date getBattleStartTime() {
        return battleStartTime;
    }

    /**
     * Sets battle start time.
     *
     * @param battleStartTime the battle start time
     */
    public void setBattleStartTime(Date battleStartTime) {
        this.battleStartTime = battleStartTime;
    }

    /**
     * Gets battle end time.
     *
     * @return the battle end time
     */
    public Date getBattleEndTime() {
        return battleEndTime;
    }

    /**
     * Sets battle end time.
     *
     * @param battleEndTime the battle end time
     */
    public void setBattleEndTime(Date battleEndTime) {
        this.battleEndTime = battleEndTime;
    }

    /**
     * Gets battle winner.
     *
     * @return the battle winner
     */
    public String getBattleWinner() {
        return battleWinner;
    }

    /**
     * Sets battle winner.
     *
     * @param battleWinner the battle winner
     */
    public void setBattleWinner(String battleWinner) {
        this.battleWinner = battleWinner;
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
