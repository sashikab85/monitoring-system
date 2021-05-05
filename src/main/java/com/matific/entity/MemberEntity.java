package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Member entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "MEMBER")
@Inheritance(strategy = InheritanceType.JOINED)
public class MemberEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer memberId;

    @Column(name = "MIN")
    private String identificationNumber;

    @Column(name = "FIRST_NAME")
    private String memberFirstName;

    @Column(name = "LAST_NAME")
    private String memberLastName;

    @Column(name = "ACTIVE")
    private byte isActive;

    /**
     * The Member age.
     */
    @Column(name = "AGE")
    Integer memberAge;

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
