package com.andigital.auth.dto;

/**
 * Created by antoniotroina
 * on 29/10/2015.
 */
public class BaseResponse {
    private int code = 0;
    private String message = "";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
