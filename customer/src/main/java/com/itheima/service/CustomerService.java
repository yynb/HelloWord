package com.itheima.service;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;

import java.sql.SQLException;
import java.util.UUID;

public class CustomerService {

    private CustomerDao dao = new CustomerDao();

    public void add(Customer c){
        try {
           //c 没有 id
            String id = UUID.randomUUID().toString().replaceAll("-", "");
            c.setCustId(id);
            dao.add(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
