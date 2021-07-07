package com.shopee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HomeServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String userName = req.getParameter("username");
    String password = req.getParameter("password");
        System.out.println(userName +":"+ password);

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("namanya", userName);
        httpSession.setAttribute("passwordnya", password);
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}
