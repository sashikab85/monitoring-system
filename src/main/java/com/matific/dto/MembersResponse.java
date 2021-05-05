package com.matific.dto;

import com.matific.model.PlayerInfo;

import java.util.List;

/**
 * The type Members response.
 */
public class MembersResponse {
    private List<PlayerInfo> playersInfo;

    /**
     * Gets players info.
     *
     * @return the players info
     */
    public List<PlayerInfo> getPlayersInfo() {
        return playersInfo;
    }

    /**
     * Sets players info.
     *
     * @param playersInfo the players info
     */
    public void setPlayersInfo(List<PlayerInfo> playersInfo) {
        this.playersInfo = playersInfo;
    }

    /**
     * Instantiates a new Members response.
     *
     * @param playersInfo the players info
     */
    public MembersResponse(List<PlayerInfo> playersInfo) {
        this.playersInfo = playersInfo;
    }

    /**
     * Instantiates a new Members response.
     */
    public MembersResponse() {
    }
}
