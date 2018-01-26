package com.mjw.bean;

import com.sun.net.httpserver.Authenticator;

public class ReturnModel {

    private int code;
    private Object data;
    private String message;

    public ReturnModel(){
        super();
    }

    public ReturnModel(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
