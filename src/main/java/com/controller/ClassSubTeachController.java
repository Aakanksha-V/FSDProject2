package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Class_Subject;
import com.entity.Classes;
import com.entity.Subject;
import com.entity.Teacher;
import com.service.Class_SubjectService;
import com.service.ClassesService;
import com.service.SubjectService;
import com.service.TeacherService;

/**
 * Servlet implementation class ClassSubTeachController
 */
public class ClassSubTeachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassSubTeachController() {
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
		ClassesService classesService = new ClassesService();
		SubjectService subjectService = new SubjectService();
		TeacherService teacherService = new TeacherService();
		List<Classes> listClasses = classesService.getAllClasses(); // getting all class list
		List<Subject> listSubjects = subjectService.getAllSubject(); // getting only those subjest which are assign to these class
		List<Teacher> listTeacher = teacherService.getAllTeachers();
		request.setAttribute("obj", listClasses);
		request.setAttribute("obj1", listSubjects);
		request.setAttribute("obj2", listTeacher);
		RequestDispatcher rd = request.getRequestDispatcher("AssignTtoCforS.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		Class_SubjectService class_SubjectService = new Class_SubjectService();
		int class_id = Integer.parseInt(request.getParameter("class"));
		System.out.println(class_id);
		int subject_id = Integer.parseInt(request.getParameter("subject"));
		System.out.println(subject_id);
		int teacher_id = Integer.parseInt(request.getParameter("teacher"));
		Class_Subject a = new Class_Subject();
		a.setClass_id(class_id);
		a.setSubject_id(subject_id);
		a.setTeacher_id(teacher_id);
		boolean result = class_SubjectService.addSubClasseachersT(a);
		RequestDispatcher rd1 = request.getRequestDispatcher("AssignTtoCforS.jsp");
		if(result)
			printWriter.println("Added subject and teacher to class");
		else
			printWriter.println("Subject and teacher already added to this class");
		doGet(request, response);
		rd1.forward(request, response);
	}

}
