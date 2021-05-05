package com.matific.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.TeamsInfo;

import java.io.Serializable;
import java.util.List;

/**
 * The type Teams info response.
 */
public class TeamsInfoResponse implements Serializable {

    @JsonProperty("teams")
    private List<TeamsInfo> teams;




    /**
     * Instantiates a new Teams info response.
     *
     * @param teams the teams
     */
    public TeamsInfoResponse(List<TeamsInfo> teams) {
        this.teams = teams;
    }

    /**
     * Instantiates a new Teams info response.
     */
    public TeamsInfoResponse() {
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */
    public List<TeamsInfo> getTeams() {
        return teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(List<TeamsInfo> teams) {
        this.teams = teams;
    }


}
