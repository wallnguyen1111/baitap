package org.example.demo33.buoi4;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MvcDemo", value = "/MvcDemo")
public class MvcDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] studens = {"student1", "student2", "student3"};
        request.setAttribute("student_list", studens);

        // get request dispatcher
        RequestDispatcher requestDispatcherst = request.getRequestDispatcher("/view/view_student.jsp");

        // forward request to JSP
        requestDispatcherst.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}