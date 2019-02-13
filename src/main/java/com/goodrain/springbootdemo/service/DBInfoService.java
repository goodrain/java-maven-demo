package com.goodrain.springbootdemo.service;

import com.goodrain.springbootdemo.dao.DBInfoDao;
import com.goodrain.springbootdemo.util.DBConnPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Service
public class DBInfoService {
    @Autowired
    public DBInfoDao dbInfoDao;

    public Boolean isClosed() throws SQLException {
        DBConnPool dcp = DBConnPool.getInstance();
        if (dcp == null) {
            return true;
        }

        Connection conn = dcp.getConnection();
        return conn.isClosed();
    }

    public List<String> listTables() throws SQLException {
        return dbInfoDao.listTables(System.getenv("MYSQL_DATABASE"));
    }
}
