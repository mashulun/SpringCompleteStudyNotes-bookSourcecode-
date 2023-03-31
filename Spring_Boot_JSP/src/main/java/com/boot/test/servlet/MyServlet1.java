package com.boot.test.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * 开发一个普通的servlet
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@WebServlet(urlPatterns = "/myServlet/*", name = "servlet1", description = "this is my first servlet in spring boot")
public class MyServlet1 extends HttpServlet implements Serializable {

    private static final long serialVersionUID = -7804219273275373955L;

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>这是：MyServlet1</h1>");
        out.println("</body>");
        out.println("</html>");
    }



}
