package com.teligen.bcks.controller;

import com.teligen.bcks.service.LoginVerify;
import com.teligen.bcks.utils.SpringContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 冶鹏豪
 * @date 2021/7/25
 */
public class LoginServlet extends HttpServlet {
    private LoginVerify loginVerify = ((LoginVerify) SpringContextUtils.getContext().getBean("loginVerify"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        boolean result = loginVerify.verifyPassword(account, password);
        resp.getWriter().println(result);
    }
}
