package com.example.web;


import com.example.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Mubsshir
 */
public class saveUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String username = request.getParameter("username");
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        String hashedPass = User.isUsernameAvailable(username);

        if (hashedPass.equals("")) {
            RequestDispatcher rd =request.getRequestDispatcher("/");
            
        } else {
            out.println("<h3>Username [ " + username + " ] is not available</h3>");
        }

    }
}
