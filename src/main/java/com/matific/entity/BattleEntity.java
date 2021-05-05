package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The type Battle entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "battle")
public class BattleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "T_ID")
    private Integer battleId;

    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE", nullable = false)
    private Date battleStartDate;

    @Column(name = "START_TIME", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date battleStartTime;

    @Column(name = "END_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date battleEndTime;

    @Column(name = "WINNER_TEAM")
    private String battleWinner;

    @OneToMany()
    @JoinColumn(name = "T_ID")
    private List<TeamAnalyticEntity> teamAnalyticEntities;

    /**
     * Gets battle id.
     *
     * @return the battle id
     */
    public Integer getBattleId() {
        return battleId;
    }

    /**
     * Sets battle id.
     *
     * @param battleId the battle id
     */
    public void setBattleId(Integer battleId) {
        this.battleId = battleId;
    }

    /**
     * Gets battle start date.
     *
     * @return the battle start date
     */
    public Date getBattleStartDate() {
        return battleStartDate;
    }

    /**
     * Sets battle start date.
     *
     * @param battleStartDate the battle start date
     */
    public void setBattleStartDate(Date battleStartDate) {
        this.battleStartDate = battleStartDate;
    }

    /**
     * Gets battle start time.
     *
     * @return the battle start time
     */
    public Date getBattleStartTime() {
        return battleStartTime;
    }

    /**
     * Sets battle start time.
     *
     * @param battleStartTime the battle start time
     */
    public void setBattleStartTime(Date battleStartTime) {
        this.battleStartTime = battleStartTime;
    }

    /**
     * Gets battle end time.
     *
     * @return the battle end time
     */
    public Date getBattleEndTime() {
        return battleEndTime;
    }

    /**
     * Sets battle end time.
     *
     * @param battleEndTime the battle end time
     */
    public void setBattleEndTime(Date battleEndTime) {
        this.battleEndTime = battleEndTime;
    }

    /**
     * Gets battle winner.
     *
     * @return the battle winner
     */
    public String getBattleWinner() {
        return battleWinner;
    }

    /**
     * Sets battle winner.
     *
     * @param battleWinner the battle winner
     */
    public void setBattleWinner(String battleWinner) {
        this.battleWinner = battleWinner;
    }

    /**
     * Gets team analytics.
     *
     * @return the team analytics
     */
    public List<TeamAnalyticEntity> getTeamAnalytics() {
        return teamAnalyticEntities;
    }

    /**
     * Sets team analytics.
     *
     * @param teamAnalyticEntities the team analytic entities
     */
    public void setTeamAnalytics(List<TeamAnalyticEntity> teamAnalyticEntities) {
        this.teamAnalyticEntities = teamAnalyticEntities;
    }
}
