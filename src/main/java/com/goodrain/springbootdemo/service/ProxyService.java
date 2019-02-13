package com.goodrain.springbootdemo.service;

import com.goodrain.springbootdemo.vo.ProxyReqVO;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@Service
public class ProxyService {
    public String doProxy(ProxyReqVO proxyReqVO) throws IOException {
        String result = "";
        switch (proxyReqVO.getMethod().toUpperCase()) {
            case "GET":
                result = doGet(proxyReqVO.getUrl());
                break;
            case "POST":
                result = doPost(proxyReqVO.getUrl(), proxyReqVO.getData());
                break;
        }
        return result;
    }

    public String doGet(String u) throws IOException {
        URL url = new URL(u);
        URLConnection conn = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            result.append(line);
        }
        in.close();

        return result.toString();
    }

    public String doPost(String u, String data) throws IOException {
        URL url = new URL(u);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Content-Type","application/json; charset=UTF-8");
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestMethod("POST");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);

        OutputStream os = conn.getOutputStream();
        DataOutputStream writer = new DataOutputStream(os);
        writer.writeBytes(data);
        writer.flush();
        writer.close();
        os.close();

        InputStream is = conn.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line);
            result.append('\r');
        }
        reader.close();

        return result.toString();
    }
}
