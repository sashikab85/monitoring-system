package com.matific.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matific.model.Battle;
import com.matific.model.Team;

import java.io.Serializable;
import java.util.List;

/**
 * The type Battle info response.
 */
public class BattleInfoResponse implements Serializable {
    @JsonProperty("tournament")
    private Battle battle;


    /**
     * Instantiates a new Battle info response.
     *
     * @param battle the battle
     */
    public BattleInfoResponse(Battle battle) {
        this.battle = battle;
    }


    /**
     * Gets battle.
     *
     * @return the battle
     */
    public Battle getBattle() {
        return battle;
    }

    /**
     * Sets battle.
     *
     * @param battle the battle
     */
    public void setBattle(Battle battle) {
        this.battle = battle;
    }


}
