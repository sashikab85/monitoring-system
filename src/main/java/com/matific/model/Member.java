package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Member.
 */
public class Member {

    @JsonProperty("id")
    private Integer memberAnalyticId;
    @JsonProperty("min")
    private String memberIdentificationNumber;
    @JsonProperty("score")
    private String memberScore;

    /**
     * Instantiates a new Member.
     *
     * @param memberAnalyticId           the member analytic id
     * @param memberIdentificationNumber the member identification number
     * @param memberScore                the member score
     */
    public Member(Integer memberAnalyticId, String memberIdentificationNumber, String memberScore) {
        this.memberAnalyticId = memberAnalyticId;
        this.memberIdentificationNumber = memberIdentificationNumber;
        this.memberScore = memberScore;
    }

    /**
     * Instantiates a new Member.
     */
    public Member() {
    }

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
