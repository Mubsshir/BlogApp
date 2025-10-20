package com.example.web;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Mubsshir
 */
public class LoginPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        

        res.setContentType("text/html");        
        RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");

        rd.forward(req, res);
        
    }
}
