package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Member analytic.
 *
 * @author Sashika
 */
@Entity
@Table(name = "MEMBER_ANALYTICS")
public class MemberAnalytic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MA_ID")
    private Integer memberAnalyticId;

    @Column(name = "MIN", nullable = false, unique = true)
    private String memberIdentificationNumber;

    @Column(name = "SCORE")
    private String memberScore;

    /**
     * Gets member analytic id.
     *
     * @return the member analytic id
     */
    public Integer getMemberAnalyticId() {
        return memberAnalyticId;
    }

    /**
     * Sets member analytic id.
     *
     * @param memberAnalyticId the member analytic id
     */
    public void setMemberAnalyticId(Integer memberAnalyticId) {
        this.memberAnalyticId = memberAnalyticId;
    }

    /**
     * Gets member identification number.
     *
     * @return the member identification number
     */
    public String getMemberIdentificationNumber() {
        return memberIdentificationNumber;
    }

    /**
     * Sets member identification number.
     *
     * @param memberIdentificationNumber the member identification number
     */
    public void setMemberIdentificationNumber(String memberIdentificationNumber) {
        this.memberIdentificationNumber = memberIdentificationNumber;
    }

    /**
     * Gets member score.
     *
     * @return the member score
     */
    public String getMemberScore() {
        return memberScore;
    }

    /**
     * Sets member score.
     *
     * @param memberScore the member score
     */
    public void setMemberScore(String memberScore) {
        this.memberScore = memberScore;
    }
}
