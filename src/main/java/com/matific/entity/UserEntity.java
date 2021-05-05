package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The type User entity.
 */
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "isEnable")
    private Boolean isEnable;
    @Column(name = "isActive")
    private Boolean isActive;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "role_user", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private List<RoleEntity> roleEntities = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<TokenEntity> tokenEntity;

    /**
     * Instantiates a new User entity.
     *
     * @param userName the user name
     * @param password the password
     * @param email    the email
     * @param isEnable the is enable
     */
    public UserEntity(String userName, String password, String email, Boolean isEnable) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.isEnable = isEnable;
    }

    /**
     * Instantiates a new User entity.
     *
     * @param userName the user name
     * @param password the password
     * @param email    the email
     * @param isEnable the is enable
     * @param isActive the is active
     */
    public UserEntity(String userName, String password, String email, Boolean isEnable, Boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.isEnable = isEnable;
        this.isActive = isActive;
    }

    /**
     * Instantiates a new User entity.
     */
    public UserEntity() {
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

    /**
     * Gets password.
     *
     * @return the password
     */
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
    public List<RoleEntity> getRoles() {
        return roleEntities;
    }

    /**
     * Sets roles.
     *
     * @param roleEntities the role entities
     */
    public void setRoles(List<RoleEntity> roleEntities) {
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
    public List<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    /**
     * Sets role entities.
     *
     * @param roleEntities the role entities
     */
    public void setRoleEntities(List<RoleEntity> roleEntities) {
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
}
