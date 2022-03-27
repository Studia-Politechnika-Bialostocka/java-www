package com.example.zad2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.example.zad2.RequestListener;

@WebServlet(name = "AddNumberServlet", value = "/add")
public class AddNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.printf("AddNumberServlet: doGet()\n");
        LinkedList numbers = RequestListener.getNumbers();
        RequestListener.printNumbers();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + numbers + "</h1>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
