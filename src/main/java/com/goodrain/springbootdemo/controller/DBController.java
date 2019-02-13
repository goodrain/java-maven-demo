package com.goodrain.springbootdemo.controller;

import com.goodrain.springbootdemo.service.DBInfoService;
import com.goodrain.springbootdemo.vo.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/dbinfo")
public class DBController {

    @Autowired
    public DBInfoService dbInfoService;

    @GetMapping("ping")
    @CrossOrigin(origins = "*")
    public RestResponse<Boolean> isConnected() throws SQLException {
        RestResponse<Boolean> resp = new RestResponse<>();
        resp.setCode("1001");
        resp.setSuccess(0);
        resp.setMsg("ok");
        resp.setData(!dbInfoService.isClosed());
        return resp;
    }

    @GetMapping("list-tables")
    @CrossOrigin(origins = "*")
    public RestResponse<List<String>> listTables() throws SQLException {
        List<String> list = dbInfoService.listTables();
        RestResponse<List<String>> resp = new RestResponse<>(0, "1002", "ok", list);
        return resp;
    }
}
