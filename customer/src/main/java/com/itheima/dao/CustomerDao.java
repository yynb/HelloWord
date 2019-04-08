package com.itheima.dao;

import com.itheima.domain.Customer;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class CustomerDao {

    private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

    public void add(Customer c) throws SQLException {

        String sql = "insert into customer values(?,?,?,?,?,?)";

        Object[] params = {c.getCustId(),c.getCustName(),c.getCustSource(),c.getCustIndustry(),c.getCustLevel(),c.getCustPhone()};
		// 测试
        //执行
        qr.update(sql,params);
    }
}
