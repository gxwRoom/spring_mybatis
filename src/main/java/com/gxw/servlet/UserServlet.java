package com.gxw.servlet;

import com.gxw.service.UserService;
import com.gxw.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User控制器
 * @author GXW工作室
 * @date 2020/6/5 0005 - 01:28
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet{
    private UserService userService;

    @Override
    public void init() throws ServletException {
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        userService = ac.getBean("userService", UserServiceImpl.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---->"+userService.findAll());
        req.setAttribute("list",userService.findAll());
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
