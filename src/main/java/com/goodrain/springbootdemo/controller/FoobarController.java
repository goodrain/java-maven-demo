package com.goodrain.springbootdemo.controller;

import com.goodrain.springbootdemo.service.FoobarService;
import com.goodrain.springbootdemo.vo.DBConnInfoRespVO;
import com.goodrain.springbootdemo.vo.GreetingReqVO;
import com.goodrain.springbootdemo.vo.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/foobar")
public class FoobarController {
    @Autowired
    private FoobarService foobarService;

    @GetMapping("/list-env")
    public RestResponse<List<String>> listEnv() {
        List<String> envs = foobarService.listEnv();
        RestResponse<List<String>> res = new RestResponse<>();
        res.setSuccess(0);
        res.setCode("3000");
        res.setMsg("");
        res.setData(envs);
        return res;
    }

    @PostMapping("/greeting")
    public RestResponse<String> greeting(@Valid @RequestBody GreetingReqVO greetingReqVO) {
        RestResponse<String> res = new RestResponse<>();
        res.setSuccess(0);
        res.setCode("4000");
        res.setMsg("");
        res.setData(greetingReqVO.getName());
        return res;
    }

    @GetMapping("/db-info")
    public RestResponse<DBConnInfoRespVO> getDBConnInfo() {
        DBConnInfoRespVO dbConnInfo = foobarService.getDBConnInfo();
        RestResponse<DBConnInfoRespVO> res = new RestResponse<>();
        res.setSuccess(0);
        res.setCode("5000");
        res.setMsg("");
        res.setData(dbConnInfo);
        return res;
    }
}
