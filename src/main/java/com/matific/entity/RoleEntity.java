package com.matific.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Role entity.
 */
@Entity
@Table(name = "role")
public class RoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer roleId;

    @Column(name = "role_name")
    private String name;

    /**
     * Instantiates a new Role entity.
     */
    public RoleEntity() {
    }

    /**
     * Instantiates a new Role entity.
     *
     * @param name the name
     */
    public RoleEntity(String name) {
        this.name = name;
    }

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
