package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pWriter = response.getWriter();
		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		String teacherName = request.getParameter("teacherName");
		Teacher teacher = new Teacher(teacherId,teacherName);
		TeacherService teacherService = new TeacherService();
		String result = teacherService.storeTeacher(teacher);
		pWriter.print(result);
		RequestDispatcher rDispatcher = request.getRequestDispatcher("AddTeacher.jsp");
		rDispatcher.include(request, response);
		
	}

}
