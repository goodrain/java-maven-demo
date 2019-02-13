package com.goodrain.springbootdemo.dao;

import java.sql.SQLException;
import java.util.List;

public interface DBInfoDao {
    List<String> listTables(String db) throws SQLException;
}

