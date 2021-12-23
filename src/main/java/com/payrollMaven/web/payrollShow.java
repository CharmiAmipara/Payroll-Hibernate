package com.payrollMaven.web;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List; 
import java.util.Iterator;

@WebServlet("/payrollShow")

public class payrollShow extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int day = Integer.parseInt(request.getParameter("day"));
		
		EmployeeDetail emp = new EmployeeDetail();
		
		Configuration con = new Configuration().configure().addAnnotatedClass(EmployeeDetail.class);
        
        ServiceRegistry  reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);	
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("FROM EmployeeDetail E WHERE E.Email = :email and E.Password = :password");
        query.setParameter("email", email);
        query.setParameter("password", password);
        List detail = query.list();
        for (Iterator iterator = detail.iterator(); iterator.hasNext();) {
        	
        	emp = (EmployeeDetail) iterator.next();
        	
        	PrintWriter pw = response.getWriter(); 
        	
        	pw.println("<!DOCTYPE html>");
    		pw.println("<html>");
    		pw.println("<head>");
    		pw.println("<title>Payroll System</title>");
    		pw.println("<link rel=\"stylesheet\" href=\"payrollMavenCss.css\">");
    		pw.println("</head>");
    		pw.println("<body>");
    		pw.println("<div class='container'>");
    		pw.println("<div class='header'>");
    		pw.println("<h1>Employee Detail</h1>");
    		pw.println("</div>");
    		pw.println("<hr>");
    		pw.println("<div class=\"detail\">");
        	
        	pw.println("Id : " + emp.getEid() );
        	pw.println("<br><br>");
        	pw.println("Name : " + emp.getName());
        	pw.println("<br><br>");
        	pw.println("Designation : " + emp.getDesignation());
        	pw.println("<br><br>");
        	pw.println("Working Days : " + day);
        	pw.println("<br><br>");
        	pw.println("Salary : " + day*emp.getSalary());
        	pw.println("<br><br>");
        	pw.println("Email Id : " + emp.getEmail());
        	pw.println("<br><br>");
        	pw.println("Password : " + emp.getPassword());
        	pw.println("<br><br>");
        	
        	pw.println("</div>");
        	pw.println("</div>");
    		pw.println("</body>");
    		pw.println("</html");
        }
        tx.commit();
        
	}

}
