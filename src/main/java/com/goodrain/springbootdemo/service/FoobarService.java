package com.goodrain.springbootdemo.service;

import com.goodrain.springbootdemo.vo.DBConnInfoRespVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class FoobarService {
    public List<String> listEnv() {
        List<String> result = new ArrayList<>();
        Map<String, String> envs = System.getenv();
        for (Map.Entry<String, String> e : envs.entrySet()) {
            result.add(e.getKey() + "=" + e.getValue());
        }
        return result;
    }

    public DBConnInfoRespVO getDBConnInfo() {
        DBConnInfoRespVO res = new DBConnInfoRespVO();
        res.setHost(System.getenv("MYSQL_HOST"));
        res.setPort(System.getenv("MYSQL_PORT"));
        res.setUser(System.getenv("MYSQL_USER"));
        res.setPassword(System.getenv("MYSQL_PASSWORD"));
        res.setDatabase(System.getenv("MYSQL_DATABASE"));
        return res;
    }
}
