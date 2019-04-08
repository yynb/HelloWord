package com.itheima.web;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        Customer customer = new Customer();
        // 解析参数
        Map<String, String[]> map = request.getParameterMap();
        try {
            BeanUtils.populate(customer,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 少了id自己生成
        new CustomerService().add(customer);// 少了id


        response.setContentType("text/html;charset=utf-8");
        // 告诉浏览器
        response.getWriter().write("<h1>SUCCESS</h1>");

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

    }
}
