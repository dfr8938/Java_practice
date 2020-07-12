package ru.dfr8938.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String kmAsString = request.getParameter("km");
        String kgAsString = request.getParameter("kg");

        int km = Integer.parseInt(kmAsString);
        double kg = Double.parseDouble(kgAsString);

        CostCalculator costCalculator = new CostCalculator(20, 500);
        double cost = costCalculator.costCalc(kg, km);

        PrintWriter printWriter = response.getWriter();

        printWriter.write("<h1>Cost: " + cost + "</h1>");

    }
}
