package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The type Team entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "TEAM")
public class TeamEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private Integer teamId;

    @Column(name = "TIN", nullable = false)
    private String teamIdentificationNumber;

    @Column(name = "NAME", unique = true, nullable = false)
    private String temName;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date teamStartDate;

    @Column(name = "ACTIVE")
    private byte isActive;

    @Column(name = "OWNER_NAME")
    private String teamOwner;

    @OneToMany()
    @JoinColumn(name = "TEAM_ID")
    private List<MemberEntity> memberEntities;

    /**
     * Gets team id.
     *
     * @return the team id
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * Sets team id.
     *
     * @param teamId the team id
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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
     * Gets tem name.
     *
     * @return the tem name
     */
    public String getTemName() {
        return temName;
    }

    /**
     * Sets tem name.
     *
     * @param temName the tem name
     */
    public void setTemName(String temName) {
        this.temName = temName;
    }

    /**
     * Gets team start date.
     *
     * @return the team start date
     */
    public Date getTeamStartDate() {
        return teamStartDate;
    }

    /**
     * Sets team start date.
     *
     * @param teamStartDate the team start date
     */
    public void setTeamStartDate(Date teamStartDate) {
        this.teamStartDate = teamStartDate;
    }

    /**
     * Is active byte.
     *
     * @return the byte
     */
    public byte isActive() {
        return isActive;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(byte active) {
        isActive = active;
    }

    /**
     * Gets team owner.
     *
     * @return the team owner
     */
    public String getTeamOwner() {
        return teamOwner;
    }

    /**
     * Sets team owner.
     *
     * @param teamOwner the team owner
     */
    public void setTeamOwner(String teamOwner) {
        this.teamOwner = teamOwner;
    }

    /**
     * Gets members.
     *
     * @return the members
     */
    public List<MemberEntity> getMembers() {
        return memberEntities;
    }

    /**
     * Sets members.
     *
     * @param memberEntities the member entities
     */
    public void setMembers(List<MemberEntity> memberEntities) {
        this.memberEntities = memberEntities;
    }
}
