//package com.spms;
//
//import java.io.IOException;
//import java.util.Date;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "exampleServlet", urlPatterns = {"/example"})
//public class ExampleServlet extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("currentDate", new Date());
//        request.getRequestDispatcher("example.jsp").forward(request, response);
//    }
//}
