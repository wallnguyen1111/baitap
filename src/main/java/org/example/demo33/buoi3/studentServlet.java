package org.example.demo33.buoi3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "studentServlet", value = "/studentServlet")
public class studentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Student Servlet</h1>");
        out.println("The student is:"+request.getParameter("firstname") + " " + request.getParameter("lastname") + " " +  request.getParameter("quoctich") + " ");
        String [] favoriteLanguages =  request.getParameterValues("favoriteLanguage");
        for(String value: favoriteLanguages){
            out.println(value);
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}