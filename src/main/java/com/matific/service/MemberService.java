package com.matific.service;

import com.matific.dto.MembersResponse;
import com.matific.dto.PlayerResponse;
import com.matific.dto.PlayersResponse;
import com.matific.exception.MemberDetailsException;


/**
 * The interface Member service.
 */
public interface MemberService {
    /**
     * Gets player by id.
     *
     * @param min the min
     * @return the player by id
     * @throws MemberDetailsException the member details exception
     */
    PlayerResponse getPlayerById(String min) throws MemberDetailsException;

    /**
     * Gets all players.
     *
     * @return the all players
     * @throws MemberDetailsException the member details exception
     */
    MembersResponse getAllPlayers() throws MemberDetailsException;

    /**
     * Filter players response.
     *
     * @param threshHold the thresh hold
     * @param tin        the tin
     * @return the players response
     * @throws MemberDetailsException the member details exception
     */
    PlayersResponse filter(double threshHold, String tin) throws MemberDetailsException;
}
