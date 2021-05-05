package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Player info.
 */
public class PlayerInfo {

    @JsonProperty("id")
    private Integer memberId;
    @JsonProperty("min")
    private String identificationNumber;
    @JsonProperty("first name")
    private String memberFirstName;
    @JsonProperty("last name")
    private String memberLastName;
    @JsonProperty("is active")
    private byte isActive;
    @JsonProperty("age")
    private Integer memberAge;

    /**
     * Instantiates a new Player info.
     *
     * @param memberId             the member id
     * @param identificationNumber the identification number
     * @param memberFirstName      the member first name
     * @param memberLastName       the member last name
     * @param isActive             the is active
     * @param memberAge            the member age
     */
    public PlayerInfo(Integer memberId, String identificationNumber, String memberFirstName, String memberLastName, byte isActive, Integer memberAge) {
        this.memberId = memberId;
        this.identificationNumber = identificationNumber;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.isActive = isActive;
        this.memberAge = memberAge;
    }

    /**
     * Gets member id.
     *
     * @return the member id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * Sets member id.
     *
     * @param memberId the member id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * Gets identification number.
     *
     * @return the identification number
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets identification number.
     *
     * @param identificationNumber the identification number
     */
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    /**
     * Gets member first name.
     *
     * @return the member first name
     */
    public String getMemberFirstName() {
        return memberFirstName;
    }

    /**
     * Sets member first name.
     *
     * @param memberFirstName the member first name
     */
    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    /**
     * Gets member last name.
     *
     * @return the member last name
     */
    public String getMemberLastName() {
        return memberLastName;
    }

    /**
     * Sets member last name.
     *
     * @param memberLastName the member last name
     */
    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    /**
     * Gets is active.
     *
     * @return the is active
     */
    public byte getIsActive() {
        return isActive;
    }

    /**
     * Sets is active.
     *
     * @param isActive the is active
     */
    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    /**
     * Gets member age.
     *
     * @return the member age
     */
    public Integer getMemberAge() {
        return memberAge;
    }

    /**
     * Sets member age.
     *
     * @param memberAge the member age
     */
    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }
}
