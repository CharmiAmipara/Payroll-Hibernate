package com.payrollMaven.web;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@WebServlet("/payrollLogin")
public class Employee extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("name");
		String des = request.getParameter("des");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		EmployeeDetail emp = new EmployeeDetail();
		emp.setEid(eid);
		emp.setName(name);
		emp.setDesignation(des);
		emp.setSalary(salary);
		emp.setEmail(email);
		emp.setPassword(password);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(EmployeeDetail.class);
        
        ServiceRegistry  reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);	
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        RequestDispatcher rs = request.getRequestDispatcher("doneindex.jsp");
        rs.forward(request, response);
	}
}
