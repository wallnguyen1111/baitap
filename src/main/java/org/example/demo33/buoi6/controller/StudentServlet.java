package org.example.demo33.buoi6.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.demo33.buoi6.entity.Student;
import org.example.demo33.buoi6.repository.StudentRepository;
import org.example.demo33.buoi6.service.StudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "StudentServlet", value = {
        "/students",
        "/students/xoa",
        "/students/chi-tiet",
        "/students/new",
        "/students/them",
        "/students/update"

})
public class StudentServlet extends HttpServlet {
    private StudentService service = new StudentService();
    private StudentRepository repository = new StudentRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path) {
            case "/students":
                listStudents(request, response);
                break;
                case "/students/new":
                    showNewForm(request,response);
                    break;
                case "/students/xoa":
                    xoaStudent(request,response);
                    break;
                    case "/students/chi-tiet":
                        update(request,response);
                        break;
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/addStudentForm.jsp").forward(request, response);
    }

    private void update(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("students", repository.chiTiet(id));
        request.getRequestDispatcher("/view/hienthi.jsp").forward(request, response);
    }

    private void xoaStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        long id = Long.parseLong(request.getParameter("id"));
        service.xoaStudent(id);
        response.sendRedirect("/students");
    }

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // lay data : students from DB
    List<Student> students = new ArrayList<>();
    students = service.getStudents();

    // data --> studentslist.jsp
    request.setAttribute("students", students);
    request.getRequestDispatcher("/view/studentList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path) {
            case "/students/them":
                themHocSinh(request,response);
                break;
                case "/students/update":
                suaHocSinh(request,response);
                break;
        }
    }

    private void suaHocSinh(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Student student = new Student(id, name, email, phone);
        service.suaStudent(student);
        response.sendRedirect("/students");
    }

    private void themHocSinh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Student student = new Student(id, name, email, phone);
        service.addStudent(student);
        response.sendRedirect("/students");
    }
}