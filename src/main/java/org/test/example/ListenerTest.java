package org.test.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by anzo0316 on 10/5/2016.
 */
public class ListenerTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();


        out.println(" This is test page <br>");
        out.println("<br>");


        Dog dog = (Dog)getServletContext().getAttribute("dog") ;

        out.println(" Dog breed is :  " +  dog.getBreed());

    }
}
