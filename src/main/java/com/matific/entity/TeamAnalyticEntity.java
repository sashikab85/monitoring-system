package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * The type Team analytic entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "TEAM_ANALYTIC")
public class TeamAnalyticEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TA_ID")
    private Integer teamAnalyticId;

    @Column(name = "TEAM_NAME")
    private String teamName;

    @Column(name = "TIN")
    private String teamIdentificationNumber;

    @Column(name = "SCORE")
    private double teamScore;


    @OneToMany()
    @JoinColumn(name = "TA_ID")
    private List<MemberAnalytic> memberAnalytics;

    /**
     * Gets team analytic id.
     *
     * @return the team analytic id
     */
    public Integer getTeamAnalyticId() {
        return teamAnalyticId;
    }

    /**
     * Sets team analytic id.
     *
     * @param teamAnalyticId the team analytic id
     */
    public void setTeamAnalyticId(Integer teamAnalyticId) {
        this.teamAnalyticId = teamAnalyticId;
    }

    /**
     * Gets team name.
     *
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets team name.
     *
     * @param teamName the team name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Gets team identification number.
     *
     * @return the team identification number
     */
    public String getTeamIdentificationNumber() {
        return teamIdentificationNumber;
    }

    /**
     * Sets team identification number.
     *
     * @param teamIdentificationNumber the team identification number
     */
    public void setTeamIdentificationNumber(String teamIdentificationNumber) {
        this.teamIdentificationNumber = teamIdentificationNumber;
    }

    /**
     * Gets team score.
     *
     * @return the team score
     */
    public double getTeamScore() {
        return teamScore;
    }

    /**
     * Sets team score.
     *
     * @param teamScore the team score
     */
    public void setTeamScore(double teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * Gets member analytics.
     *
     * @return the member analytics
     */
    public List<MemberAnalytic> getMemberAnalytics() {
        return memberAnalytics;
    }

    /**
     * Sets member analytics.
     *
     * @param memberAnalytics the member analytics
     */
    public void setMemberAnalytics(List<MemberAnalytic> memberAnalytics) {
        this.memberAnalytics = memberAnalytics;
    }
}
