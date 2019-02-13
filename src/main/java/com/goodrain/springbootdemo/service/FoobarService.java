package com.goodrain.springbootdemo.service;

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
}
