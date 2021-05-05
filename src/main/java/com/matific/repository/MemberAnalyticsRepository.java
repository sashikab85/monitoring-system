package com.matific.repository;

import com.matific.entity.MemberAnalytic;
import com.matific.model.PlayerAvg;
import com.matific.model.PlayersAvg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberAnalyticsRepository extends JpaRepository<MemberAnalytic, Integer> {

    public static final String memberAvg = "select min,count(*) as count,sum(score) as total, sum(score)/count(*) as avg from member_analytics where min = :min";

    public static final String membersAvg = "select min,count(*) as count, sum(score) as total,  sum(score)/count(*) as avg from member_analytics group by min";

    @Query(value = memberAvg, nativeQuery = true)
    public PlayerAvg findPlayerAvg(@Param("min") String min);

    @Query(value = membersAvg, nativeQuery = true)
    public List<PlayersAvg> findPlayersAvg();
}
