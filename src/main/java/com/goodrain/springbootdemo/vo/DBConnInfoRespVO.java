package com.goodrain.springbootdemo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBConnInfoRespVO {
    @JsonProperty("MYSQL_HOST")
    private String host;

    @JsonProperty("MYSQL_PORT")
    private String port;

    @JsonProperty("MYSQL_USER")
    private String user;

    @JsonProperty("MYSQL_PASSWORD")
    private String password;

    @JsonProperty("MYSQL_DATABASE")
    private String database;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
