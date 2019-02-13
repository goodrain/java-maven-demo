package com.goodrain.springbootdemo.dao;

import com.goodrain.springbootdemo.util.DBConnPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DBInfoDaoImpl implements DBInfoDao {

    @Override
    public List<String> listTables(String db) throws SQLException {
        DBConnPool dcp = DBConnPool.getInstance();
        if (dcp == null) {
            return new ArrayList<>();
        }

        Connection conn = dcp.getConnection();
        DatabaseMetaData md = conn.getMetaData();
        ResultSet rs = md.getTables(db, null, "%", null);
        List<String> result = new ArrayList<>();
        while (rs.next()) {
            result.add(rs.getString(3));
        }
        return result;
    }
}
