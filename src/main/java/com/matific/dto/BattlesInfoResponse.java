package com.matific.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.Battle;

import java.util.List;

/**
 * The type Battles info response.
 */
public class BattlesInfoResponse {

    @JsonProperty("tournaments")
    private List<Battle> battle;



    /**
     * Instantiates a new Battles info response.
     *
     * @param battle the battle
     */
    public BattlesInfoResponse(List<Battle> battle) {
        this.battle = battle;
    }

    /**
     * Instantiates a new Battles info response.
     */
    public BattlesInfoResponse() {
    }

    /**
     * Gets battle.
     *
     * @return the battle
     */
    public List<Battle> getBattle() {
        return battle;
    }

    /**
     * Sets battle.
     *
     * @param battle the battle
     */
    public void setBattle(List<Battle> battle) {
        this.battle = battle;
    }

}
