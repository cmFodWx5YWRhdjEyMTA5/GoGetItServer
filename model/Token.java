package com.example.root.gogetitserver.model;

public class Token {
    private String token;
    private Boolean isServerToken;

    public Token(String token, Boolean isServerToken) {
        this.token = token;
        this.isServerToken = isServerToken;
    }

    public Token() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getServerToken() {
        return isServerToken;
    }

    public void setServerToken(Boolean serverToken) {
        isServerToken = serverToken;
    }
}
