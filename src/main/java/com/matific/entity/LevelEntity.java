package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The type Level entity.
 *
 * @author Sashika
 */
@Entity
@Table(name = "LEVEL")
public class LevelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEVEL_ID")
    private Integer levelId;

    @Column(name = "LEVEL_NAME", nullable = false)
    private String levelName;

    public Integer getLevelId() {
        return levelId;
    }

    /**
     * Sets level id.
     *
     * @param levelId the level id
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * Gets level name.
     *
     * @return the level name
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * Sets level name.
     *
     * @param levelName the level name
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * The type Role.
     */
    public static class Role {
    }
}

