package com.matific.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.Player;

/**
 * The type Player response.
 */
public class PlayerResponse {

    @JsonProperty("player")
    private Player player;

    /**
     * Instantiates a new Player response.
     *
     * @param player the player
     */
    public PlayerResponse(Player player) {
        this.player = player;
    }

    /**
     * Instantiates a new Player response.
     */
    public PlayerResponse() {
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}
