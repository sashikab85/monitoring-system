package com.matific.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * The type Role.
 */
public class Role implements GrantedAuthority {

    private String role;

    /**
     * Instantiates a new Role.
     */
    public Role() {
    }

    /**
     * Instantiates a new Role.
     *
     * @param role the role
     */
    public Role(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.getRole();
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        this.role = role;
    }
}
