package com.example.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet("/servlet-profile")
public class UserProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        // Mock Business Data
        String username = "Alex Mercer";
        String role = "Lead Developer";
        List<String> activities = Arrays.asList(
            "Submitted pull request #104",
            "Reviewed team database schema",
            "Updated server deployment script"
        );

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <title>User Profile (Servlet)</title>");
            out.println("    <style>");
            out.println("        body { font-family: sans-serif; margin: 30px; background: #f4f4f9; }");
            out.println("        .card { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }");
            out.println("        .badge { background: #007bff; color: white; padding: 4px 8px; border-radius: 4px; }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class=\"card\">");
            out.println("        <h1>User Profile</h1>");
            out.println("        <p><strong>Name:</strong> " + username + "</p>");
            out.println("        <p><strong>Role:</strong> <span class=\"badge\">" + role + "</span></p>");
            out.println("        <h3>Recent Activity</h3>");
            out.println("        <ul>");

            // Loop to render activity items dynamically
            for (String activity : activities) {
                out.println("            <li>" + activity + "</li>");
            }

            out.println("        </ul>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
