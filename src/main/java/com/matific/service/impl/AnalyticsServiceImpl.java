package com.matific.service.impl;


import com.matific.entity.BattleEntity;
import com.matific.entity.MemberAnalytic;
import com.matific.entity.TeamAnalyticEntity;
import com.matific.exception.DashBoardAnalyticsException;
import com.matific.model.*;
import com.matific.repository.*;
import com.matific.service.AnalyticsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Analytics service.
 */
@Service
public class AnalyticsServiceImpl implements AnalyticsServices {

    /**
     * The Dash board repository.
     */
    @Autowired
    LevelRepository dashBoardRepository;

    /**
     * The Battle repository.
     */
    @Autowired
    BattleRepository battleRepository;

    /**
     * The Team analytics repository.
     */
    @Autowired
    TeamAnalyticsRepository teamAnalyticsRepository;

    /**
     * The Token repository.
     */
    @Autowired
    TokenRepository tokenRepository;

    /**
     * The User repository.
     */
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Level> getAllGameLevels() throws DashBoardAnalyticsException {
        return dashBoardRepository
                .findAll()
                .stream()
                .map( levelEntity -> new Level(levelEntity.getLevelId(), levelEntity.getLevelName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Battle> getGames() throws DashBoardAnalyticsException {
        return battleRepository
                .findAll()
                .stream()
                .map( battle -> new Battle(
                        battle.getBattleStartDate(),
                        battle.getBattleStartTime(),
                        battle.getBattleEndTime(),
                        battle.getBattleWinner(),
                        new ArrayList<Team>()))
                .collect(Collectors.toList());
    }

    @Override
    public Battle getBattleInfo(Integer id) throws DashBoardAnalyticsException {
        BattleEntity battleEntity = battleRepository.findById(id).get();
        Battle battle = new Battle();
        battle.setBattleEndTime(battleEntity.getBattleEndTime());
        battle.setBattleWinner(battleEntity.getBattleWinner());
        battle.setBattleStartDate(battleEntity.getBattleStartDate());
        battle.setBattleStartTime(battleEntity.getBattleStartTime());

        List<Team> teams = new ArrayList<>();

        for (TeamAnalyticEntity teamAnalyticEntity : battleEntity.getTeamAnalytics()) {
            Team team = new Team(teamAnalyticEntity.getTeamAnalyticId(),
                    teamAnalyticEntity.getTeamName(),
                    teamAnalyticEntity.getTeamIdentificationNumber(),
                    teamAnalyticEntity.getTeamScore(), 0.0);
            teams.add(team);
        }
        battle.setTeams(teams);
        return battle;
    }

    @Override
    public List<TeamsInfo> getTeamsInfo() throws DashBoardAnalyticsException {
        return teamAnalyticsRepository
                .findAll().stream()
                .map(teamAnalyticEntity -> new TeamsInfo (teamAnalyticEntity.getTeamAnalyticId(),
                teamAnalyticEntity.getTeamName(),
                teamAnalyticEntity.getTeamIdentificationNumber())).collect(Collectors.toList());
    }

    @Override
    public Team getTeamInfo(Integer id) throws DashBoardAnalyticsException {
        TeamAnalyticEntity teamAnalyticEntity = teamAnalyticsRepository.findById(id).get();
        Team team = new Team(teamAnalyticEntity.getTeamAnalyticId(),
                teamAnalyticEntity.getTeamName(),
                teamAnalyticEntity.getTeamIdentificationNumber(),
                teamAnalyticEntity.getTeamScore(),
                teamAnalyticsRepository.findTeamsAvg(teamAnalyticEntity.getTeamIdentificationNumber()).getAvg());
        List<Member> members = new ArrayList<>();
        for (MemberAnalytic memberAnalytic : teamAnalyticEntity.getMemberAnalytics()) {
            Member member = new Member(memberAnalytic.getMemberAnalyticId(),
                    memberAnalytic.getMemberIdentificationNumber(), memberAnalytic.getMemberScore());
            members.add(member);
        }
        return team;
    }

    public UserAnalytics getSystemUsageInfo() throws DashBoardAnalyticsException {

        List<UserActivity> systemUsages = tokenRepository.getSystemUsage()
                .stream()
                .filter(usageInfo -> usageInfo.getTimeSpent() > 0)
                .map(usageInfo -> new UserActivity(usageInfo.getUserName(), usageInfo.getTimeSpent()))
                .collect(Collectors.toList());

        int activeUsers = userRepository.getActiveUserCount();
        int loggedUsers = userRepository.getLoggedinUserCount();
        UserAnalytics userAnalytics = new UserAnalytics(activeUsers, loggedUsers, systemUsages);
        return userAnalytics;
    }
}
