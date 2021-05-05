package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Player.
 */
public class Player {

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
    @JsonProperty("height")
    private float height;
    @JsonProperty("weight")
    private float weight;
    @JsonProperty("total score")
    private double totalScore;
    @JsonProperty("battles count")
    private int numberOfBattles;
    @JsonProperty("avg score")
    private double avgScore;

    /**
     * Instantiates a new Player.
     *
     * @param memberId             the member id
     * @param identificationNumber the identification number
     * @param memberFirstName      the member first name
     * @param memberLastName       the member last name
     * @param isActive             the is active
     * @param memberAge            the member age
     * @param height               the height
     * @param weight               the weight
     * @param totalScore           the total score
     * @param numberOfBattles      the number of battles
     * @param avgScore             the avg score
     */
    public Player(Integer memberId, String identificationNumber, String memberFirstName, String memberLastName, byte isActive, Integer memberAge, float height, float weight, double totalScore, int numberOfBattles, double avgScore) {
        this.memberId = memberId;
        this.identificationNumber = identificationNumber;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.isActive = isActive;
        this.memberAge = memberAge;
        this.height = height;
        this.weight = weight;
        this.totalScore = totalScore;
        this.numberOfBattles = numberOfBattles;
        this.avgScore = avgScore;
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

    /**
     * Gets height.
     *
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Gets total score.
     *
     * @return the total score
     */
    public double getTotalScore() {
        return totalScore;
    }

    /**
     * Sets total score.
     *
     * @param totalScore the total score
     */
    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * Gets number of battles.
     *
     * @return the number of battles
     */
    public int getNumberOfBattles() {
        return numberOfBattles;
    }

    /**
     * Sets number of battles.
     *
     * @param numberOfBattles the number of battles
     */
    public void setNumberOfBattles(int numberOfBattles) {
        this.numberOfBattles = numberOfBattles;
    }

    /**
     * Gets avg score.
     *
     * @return the avg score
     */
    public double getAvgScore() {
        return avgScore;
    }

    /**
     * Sets avg score.
     *
     * @param avgScore the avg score
     */
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
}
