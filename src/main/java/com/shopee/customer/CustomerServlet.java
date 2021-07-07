package com.shopee.customer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServlet extends HttpServlet {
    private CustomerDAO customerDAO;

    @Override
    public void init() throws ServletException {
        customerDAO = new CustomerDAO();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LEWAT SERVLET");
        List<Customer> customers = customerDAO.getAllCustomer();
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(10,"Tika", "tika@gmail.com", "082645477", "manasaja"));
//        customers.add(new Customer(20,"Yesi", "tika@gmail.com", "082645477", "manasaja"));
//        customers.add(new Customer(30,"Kristiani", "tika@gmail.com", "082645477", "manasaja"));
        req.setAttribute("name", "Tika Yesi Kristiani");
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("customer/customer.jsp").forward(req, resp);
    }
}
