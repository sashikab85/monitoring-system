package com.matific.model;

/**
 * The type Authentication response.
 */
public class AuthenticationResponse {

    private final String jwt;

    /**
     * Instantiates a new Authentication response.
     *
     * @param jwt the jwt
     */
    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    /**
     * Gets jwt.
     *
     * @return the jwt
     */
    public String getJwt() {
        return jwt;
    }
}
