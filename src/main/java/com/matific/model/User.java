package com.matific.model;

import com.matific.entity.TokenEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * The type User.
 */
public class User implements UserDetails {

    private Integer id;
    private String userName;
    private String password;
    private String email;
    private Boolean isEnable;
    private String jwt;
    private Boolean isActive;
    private List<GrantedAuthority> roleEntities;
    private List<TokenEntity> tokenEntity;

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param userName     the user name
     * @param password     the password
     * @param isEnable     the is enable
     * @param roleEntities the role entities
     * @param isActive     the is active
     */
    public User(String userName, String password, Boolean isEnable, List<GrantedAuthority> roleEntities, Boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.isEnable = isEnable;
        this.roleEntities = roleEntities;
        this.isActive = isActive;
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     */
    public User(String userName) {
        this.userName = userName;
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     * @param email    the email
     */
    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    /**
     * Instantiates a new User.
     *
     * @param id       the id
     * @param userName the user name
     * @param password the password
     * @param email    the email
     * @param isEnable the is enable
     */
    public User(Integer id, String userName, String password, String email, Boolean isEnable) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.isEnable = isEnable;
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     * @param email    the email
     * @param isEnable the is enable
     * @param isActive the is active
     */
    public User(String userName, String password, String email, Boolean isEnable, Boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.isEnable = isEnable;
        this.isActive = isActive;
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

    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets enable.
     *
     * @return the enable
     */
    public Boolean getEnable() {
        return isEnable;
    }

    /**
     * Sets enable.
     *
     * @param enable the enable
     */
    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    /**
     * Gets roles.
     *
     * @return the roles
     */
    public List<GrantedAuthority> getRoles() {
        return roleEntities;
    }

    /**
     * Sets roles.
     *
     * @param roleEntities the role entities
     */
    public void setRoles(List<GrantedAuthority> roleEntities) {
        this.roleEntities = roleEntities;
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public List<TokenEntity> getToken() {
        return tokenEntity;
    }

    /**
     * Sets token.
     *
     * @param tokenEntity the token entity
     */
    public void setToken(List<TokenEntity> tokenEntity) {
        this.tokenEntity = tokenEntity;
    }

    /**
     * Gets active.
     *
     * @return the active
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(Boolean active) {
        isActive = active;
    }

    /**
     * Gets role entities.
     *
     * @return the role entities
     */
    public List<GrantedAuthority> getRoleEntities() {
        return roleEntities;
    }

    /**
     * Sets role entities.
     *
     * @param roleEntities the role entities
     */
    public void setRoleEntities(List<GrantedAuthority> roleEntities) {
        this.roleEntities = roleEntities;
    }

    /**
     * Gets token entity.
     *
     * @return the token entity
     */
    public List<TokenEntity> getTokenEntity() {
        return tokenEntity;
    }

    /**
     * Sets token entity.
     *
     * @param tokenEntity the token entity
     */
    public void setTokenEntity(List<TokenEntity> tokenEntity) {
        this.tokenEntity = tokenEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.getRoles();
    }

    @Override
    public String getUsername() {
        return this.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.getEnable();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", isEnable=" + isEnable +
                ", isActive=" + isActive +
                '}';
    }
}
