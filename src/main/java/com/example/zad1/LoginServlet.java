package com.example.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ServletContext context = this.getServletContext();
        context.setAttribute("username", username);
        context.setAttribute("password", password);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/PrintServlet");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ServletContext context = this.getServletContext();
        context.setAttribute("username", username);
        context.setAttribute("password", password);

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        RequestDispatcher dispatcher = request.getRequestDispatcher("PrintServlet");
        dispatcher.forward(request, response);
    }
}
