package com.matific.controller;

import com.matific.dto.*;
import com.matific.exception.DashBoardAnalyticsException;
import com.matific.model.*;
import com.matific.service.AnalyticsServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * The type Analytics controller.
 */
@RestController
@RequestMapping("/dashboard")
public class AnalyticsController {

    /**
     * The Analytics services.
     */
    @Autowired
    AnalyticsServices analyticsServices;

    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(AnalyticsController.class);


    /**
     * Gets game levels.
     *
     * @return the game levels
     */
    @RequestMapping(value = "/game-levels", method = RequestMethod.GET)
    @Secured({"ROLE_COACH", "ROLE_ADMIN"})
    public ResponseEntity<LevelsResponse> getGameLevels() {
        logger.info(" >>>>>>>> inside getGameLevels");
        List<Level> levels = null;
        try {
            levels = analyticsServices.getAllGameLevels();
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getGameLevels");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new LevelsResponse(Arrays.asList()));
        }
        logger.info(" >>>>>>>> getGameLevels successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(new LevelsResponse(levels));
    }


    /**
     * Gets games.
     *
     * @return the games
     */
    @RequestMapping(value = "/games", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN", "ROLE_COACH"})
    public ResponseEntity<BattlesInfoResponse> getGames() {
        logger.info(" >>>>>>>> inside getGames");
        List<Battle> battles = null;
        try {
            battles = analyticsServices.getGames();
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getGames");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new BattlesInfoResponse(Arrays.asList()));
        }
        logger.info(" >>>>>>>> getGames successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(new BattlesInfoResponse(battles));
    }


    /**
     * Gets game info by level.
     *
     * @param id the id
     * @return the game info by level
     */
    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN", "ROLE_COACH"})
    public ResponseEntity<BattleInfoResponse> getGameInfoByLevel(@PathVariable("id") Integer id) {
        logger.info(" >>>>>>>> inside getGameInfoByLevel");
        Battle battle = null;
        try {
            battle = analyticsServices.getBattleInfo(id);
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getGameInfoByLevel");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new BattleInfoResponse(new Battle()));
        }
        logger.info(" >>>>>>>> getGameInfoByLevel successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(new BattleInfoResponse(battle));
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */
    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN", "ROLE_COACH"})
    public ResponseEntity<TeamsInfoResponse> getTeams() {
        logger.info(" >>>>>>>> inside getTeams");
        List<TeamsInfo> teamsInfo = null;
        try {
            teamsInfo = analyticsServices.getTeamsInfo();
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getTeams");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new TeamsInfoResponse(Arrays.asList()));
        }
        logger.info(" >>>>>>>> getTeams successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(new TeamsInfoResponse(teamsInfo));
    }


    /**
     * Gets team by id.
     *
     * @param id the id
     * @return the team by id
     */
    @RequestMapping(value = "/team/{id}", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN", "ROLE_COACH"})
    public ResponseEntity<TeamInfoResponse> getTeamById(@PathVariable("id") Integer id) {
        logger.info(" >>>>>>>> inside getTeamById");
        Team team = null;
        try {
            team = analyticsServices.getTeamInfo(id);
            ;
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getTeamById");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new TeamInfoResponse(new Team()));
        }
        logger.info(" >>>>>>>> getTeamById successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(new TeamInfoResponse(team));
    }

    /**
     * Gets system usage info.
     *
     * @return the system usage info
     */
    @RequestMapping(value = "/system-usage", method = RequestMethod.GET)
    @Secured("ROLE_ADMIN")
    public ResponseEntity<UserAnalytics> getSystemUsageInfo() {
        logger.info(" >>>>>>>> inside getTeamById");
        UserAnalytics userAnalytics = null;
        try {
            userAnalytics = analyticsServices.getSystemUsageInfo();
        } catch (DashBoardAnalyticsException e) {
            logger.info(" >>>>>>>> error inside getSystemUsageInfo");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new UserAnalytics());
        }
        logger.info(" >>>>>>>> getSystemUsageInfo successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(userAnalytics);
    }
}
