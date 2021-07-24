package com.teligen.bcks;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 冶鹏豪
 * @date 2021/7/20
 */
public class MyHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        First first = (First)SpringContextUtils.getContext().getBean("first");
        resp.getWriter().println(first.getI());
    }
}
