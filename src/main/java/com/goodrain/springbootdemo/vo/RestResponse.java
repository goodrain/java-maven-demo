package com.goodrain.springbootdemo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestResponse<T> {
    @JsonProperty("success")
    private int success;

    @JsonProperty("code")
    private String code;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("data")
    private T data;

    public RestResponse() {
    }

    public RestResponse(int success, String code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
