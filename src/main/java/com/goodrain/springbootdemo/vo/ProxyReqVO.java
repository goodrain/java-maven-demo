package com.goodrain.springbootdemo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ProxyReqVO {
    @NotNull(message = "url cannot be null")
    @JsonProperty("proxy_url")
    private String url;

    @NotNull(message = "method cannot be null")
    @JsonProperty("proxy_method")
    private String method;

    @JsonProperty("data")
    private String data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
