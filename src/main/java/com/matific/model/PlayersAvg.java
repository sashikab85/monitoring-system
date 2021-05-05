package com.matific.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The interface Players avg.
 */
public interface PlayersAvg {

    /**
     * The constant count.
     */
    public Integer count = null;

    /**
     * The constant avg.
     */
    public Double avg = null;

    /**
     * The constant total.
     */
    public Double total = null;

    /**
     * The constant min.
     */
    public String min = null;

    /**
     * Gets count.
     *
     * @return the count
     */
    @JsonProperty("tournaments played")
    Integer getCount();

    /**
     * Gets avg.
     *
     * @return the avg
     */
    @JsonProperty("avg score")
    Double getAvg();

    /**
     * Gets total.
     *
     * @return the total
     */
    @JsonProperty("total score")
    Double getTotal();

    /**
     * Gets min.
     *
     * @return the min
     */
    String getMin();
}
