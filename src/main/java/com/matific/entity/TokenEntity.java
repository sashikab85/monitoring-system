package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The type Token entity.
 */
@Entity
@Table(name = "token_store")
public class TokenEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_id")
    private Integer id;
    @Column(name = "jwt_token")
    private String jwt;
    @Column(name = "enable")
    private boolean isEnable;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "session_id")
    private String sessionId;
    @Column(name = "login_date")
    private Date loginDate;
    @Column(name = "logout_date")
    private Date logoutDate;
    @Column(name = "time_spent")
    private float spentTime;

    /**
     * Instantiates a new Token entity.
     *
     * @param jwt      the jwt
     * @param isEnable the is enable
     * @param userName the user name
     */
    public TokenEntity(String jwt, boolean isEnable, String userName) {
        this.jwt = jwt;
        this.isEnable = isEnable;
        this.userName = userName;
    }

    /**
     * Instantiates a new Token entity.
     *
     * @param jwt       the jwt
     * @param isEnable  the is enable
     * @param userName  the user name
     * @param sessionId the session id
     */
    public TokenEntity(String jwt, boolean isEnable, String userName, String sessionId) {
        this.jwt = jwt;
        this.isEnable = isEnable;
        this.userName = userName;
        this.sessionId = sessionId;
    }

    /**
     * Instantiates a new Token entity.
     *
     * @param jwt        the jwt
     * @param isEnable   the is enable
     * @param userName   the user name
     * @param sessionId  the session id
     * @param loginDate  the login date
     * @param logoutDate the logout date
     * @param spentTime  the spent time
     */
    public TokenEntity(String jwt, boolean isEnable, String userName, String sessionId, Date loginDate, Date logoutDate, float spentTime) {
        this.jwt = jwt;
        this.isEnable = isEnable;
        this.userName = userName;
        this.sessionId = sessionId;
        this.loginDate = loginDate;
        this.logoutDate = logoutDate;
        this.spentTime = spentTime;
    }

    /**
     * Instantiates a new Token entity.
     */
    public TokenEntity() {
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

    /**
     * Gets session id.
     *
     * @return the session id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets session id.
     *
     * @param sessionId the session id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Gets login date.
     *
     * @return the login date
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * Sets login date.
     *
     * @param loginDate the login date
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * Gets logout date.
     *
     * @return the logout date
     */
    public Date getLogoutDate() {
        return logoutDate;
    }

    /**
     * Sets logout date.
     *
     * @param logoutDate the logout date
     */
    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }

    /**
     * Gets spent time.
     *
     * @return the spent time
     */
    public float getSpentTime() {
        return spentTime;
    }

    /**
     * Sets spent time.
     *
     * @param spentTime the spent time
     */
    public void setSpentTime(float spentTime) {
        this.spentTime = spentTime;
    }
}
