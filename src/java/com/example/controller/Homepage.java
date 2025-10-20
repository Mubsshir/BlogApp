package com.example.controller;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Mubsshir
 */
public class Homepage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        

        res.setContentType("text/html");        
        RequestDispatcher rd=req.getRequestDispatcher("/HomePage.jsp");

        rd.forward(req, res);
        
    }
}
