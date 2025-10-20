package com.example.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Mubsshir
 */
public class Homepage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");        
        RequestDispatcher rd=req.getRequestDispatcher("Homepage.jsp");
        rd.forward(req, res);
        
    }
}
