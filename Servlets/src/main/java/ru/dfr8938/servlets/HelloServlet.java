package ru.dfr8938.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello!!!</h1>");
        writer.write("<h2>Hello!!!</h2>");
        writer.write("<h3>Hello!!!</h3>");
        writer.write("<h3>Hello!!!</h4>");
        writer.write("<h5>Hello!!!</h5>");
        writer.write("<p>Hello!!!</p>");
        writer.write("<a href='#'>Hello!!!</a>");
    }
}