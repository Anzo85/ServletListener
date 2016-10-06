package org.test.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by anzo0316 on 10/5/2016.
 */
public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext sc = servletContextEvent.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d  = new Dog(dogBreed);
        sc.setAttribute("dog", d);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
