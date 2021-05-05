package com.matific.repository;

import com.matific.entity.TeamAnalyticEntity;
import com.matific.entity.TeamAvgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TeamAnalyticsRepository extends JpaRepository<TeamAnalyticEntity, Integer> {

    public static final String teamAvg = "select tin, sum(score) as teamTotal, sum(score)/count(*) as avg from team_analytic where tin = :tin";

    @Query(value = teamAvg, nativeQuery = true)
    public TeamAvgEntity findTeamsAvg(@Param("tin") String tin);

}
