package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Welcome");
		StudentService ser = new StudentService();
		List<Student> listOfStud = ser.getAllRecord();
		Iterator<Student> iterator = listOfStud.iterator();
		while (iterator.hasNext()) {
			Student s = (Student) iterator.next();
			System.out.println(s.getStudentId()+" "+s.getStudentName());
			
		}
		request.setAttribute("obj", listOfStud);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayStudent.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter printWriter = response.getWriter();
		
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String studentName = request.getParameter("studentName");
		int class_id = Integer.parseInt(request.getParameter("class_id"));
		Student student = new Student(studentId,studentName,class_id);
		StudentService studentService = new StudentService();
		String result = studentService.sotreStudentRecord(student);
		printWriter.print(result);
		
	}

}
