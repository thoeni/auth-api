package com.andigital.auth.dto;

import com.andigital.auth.model.User;

/**
 * Created by antoniotroina
 * on 29/10/2015.
 */
public class AuthResponse extends BaseResponse {

    private String token;
    private User user;

    public AuthResponse(User user, String token) {
        this.setCode(200);
        this.setMessage("OK");
        this.setToken(token);
        this.setUser(user);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
