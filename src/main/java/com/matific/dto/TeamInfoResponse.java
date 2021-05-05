package com.matific.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.Team;

/**
 * The type Team info response.
 */
public class TeamInfoResponse {
    @JsonProperty("team")
    private Team team;

    public TeamInfoResponse(Team team) {
        this.team = team;
    }

    /**
     * Instantiates a new Team info response.
     */
    public TeamInfoResponse() {
    }

    /**
     * Gets team.
     *
     * @return the team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Sets team.
     *
     * @param team the team
     */
    public void setTeam(Team team) {
        this.team = team;
    }
}
