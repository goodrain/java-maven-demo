package com.goodrain.springbootdemo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class GreetingReqVO {
    @NotNull(message = "name cannot be null")
    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
