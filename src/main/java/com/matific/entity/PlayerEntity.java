package com.matific.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The type Player entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "PLAYER")
public class PlayerEntity extends MemberEntity {

    @Column(name = "HEIGHT")
    private float height;

    @Column(name = "WEIGHT")
    private float weight;

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
}
