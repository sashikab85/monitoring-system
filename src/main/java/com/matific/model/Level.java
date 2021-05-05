package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Level.
 */
public class Level implements Serializable {

    @JsonProperty("id")
    private Integer levelId;
    @JsonProperty("name")
    private String levelName;

    /**
     * Instantiates a new Level.
     *
     * @param levelId   the level id
     * @param levelName the level name
     */
    public Level(Integer levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;
    }

    /**
     * Instantiates a new Level.
     */
    public Level() {
    }


    /**
     * Gets level id.
     *
     * @return the level id
     */
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

    @Override
    public String toString() {
        return "Level{" +
                "levelId=" + levelId +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
