package com.matific.service;


import com.matific.exception.DashBoardAnalyticsException;
import com.matific.model.*;

import java.util.List;


/**
 * The interface Analytics services.
 */
public interface AnalyticsServices {
    /**
     * Gets all game levels.
     *
     * @return the all game levels
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    List<Level> getAllGameLevels() throws DashBoardAnalyticsException;

    /**
     * Gets games.
     *
     * @return the games
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    List<Battle> getGames() throws DashBoardAnalyticsException;

    /**
     * Gets battle info.
     *
     * @param id the id
     * @return the battle info
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    Battle getBattleInfo(Integer id) throws DashBoardAnalyticsException;

    /**
     * Gets teams info.
     *
     * @return the teams info
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    List<TeamsInfo> getTeamsInfo() throws DashBoardAnalyticsException;

    /**
     * Gets team info.
     *
     * @param id the id
     * @return the team info
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    Team getTeamInfo(Integer id) throws DashBoardAnalyticsException;

    /**
     * Gets system usage info.
     *
     * @return the system usage info
     * @throws DashBoardAnalyticsException the dash board analytics exception
     */
    UserAnalytics getSystemUsageInfo() throws DashBoardAnalyticsException;
}
