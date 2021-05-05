package com.matific.model;

/**
 * The type Token.
 */
public class Token {

    private Integer id;
    private String jwt;
    private boolean isEnable;
    private String userName;

    /**
     * Instantiates a new Token.
     *
     * @param jwt      the jwt
     * @param isEnable the is enable
     */
    public Token(String jwt, boolean isEnable) {

        this.jwt = jwt;
        this.isEnable = isEnable;
    }

    /**
     * Instantiates a new Token.
     *
     * @param jwt      the jwt
     * @param isEnable the is enable
     * @param userName the user name
     */
    public Token(String jwt, boolean isEnable, String userName) {
        this.jwt = jwt;
        this.isEnable = isEnable;
        this.userName = userName;
    }

    /**
     * Instantiates a new Token.
     */
    public Token() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets jwt.
     *
     * @return the jwt
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * Sets jwt.
     *
     * @param jwt the jwt
     */
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    /**
     * Is enable boolean.
     *
     * @return the boolean
     */
    public boolean isEnable() {
        return isEnable;
    }

    /**
     * Sets enable.
     *
     * @param enable the enable
     */
    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}