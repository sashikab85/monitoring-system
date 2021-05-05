package com.matific.dto;

import com.matific.model.Level;

import java.io.Serializable;
import java.util.List;

/**
 * The type Levels response.
 */
public class LevelsResponse implements Serializable {
    private List<Level> level;

    /**
     * Gets level.
     *
     * @return the level
     */
    public List<Level> getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(List<Level> level) {
        this.level = level;
    }

    /**
     * Instantiates a new Levels response.
     *
     * @param level the level
     */
    public LevelsResponse(List<Level> level) {
        this.level = level;
    }
}
