package com.matific.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.PlayersAvg;

import java.util.List;

/**
 * The type Players response.
 */
public class PlayersResponse {
    @JsonProperty("team_total_score")
    private double totalScore;

    @JsonProperty("team_average_score")
    private double averageScore;

    @JsonProperty("team_average_percentage")
    private double avgAsPercentage;

    @JsonProperty("players")
    private List<PlayersAvg> player;

    /**
     * Instantiates a new Players response.
     *
     * @param player the player
     */
    public PlayersResponse(List<PlayersAvg> player) {
        this.player = player;
    }

    public PlayersResponse(double totalScore, double averageScore, List<PlayersAvg> player) {
        this.totalScore = totalScore;
        this.averageScore = averageScore;
        this.player = player;
    }

    public PlayersResponse(double totalScore, double averageScore, double avgAsPercentage, List<PlayersAvg> player) {
        this.totalScore = totalScore;
        this.averageScore = averageScore;
        this.avgAsPercentage = avgAsPercentage;
        this.player = player;
    }

    /**
     * Instantiates a new Players response.
     */
    public PlayersResponse() {
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public List<PlayersAvg> getPlayer() {
        return player;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(List<PlayersAvg> player) {
        this.player = player;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
