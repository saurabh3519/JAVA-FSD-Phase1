package com.simplilearn.demo;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.module.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/add")
public class SaveServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");

		PrintWriter out= resp.getWriter();
		
		Configuration configuration = new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory= HibernateUtils.getSessionFactory();
		Session session= factory.openSession();
		
		
		Transaction tx= session.beginTransaction();
		String prname= req.getParameter("Pname");
		String prdesc= req.getParameter("Pdesc");
		String prprice= req.getParameter("Pprice");
		
		student s1=new student(prname, prdesc, prprice);
		session.save(s1)
		
		tx.commit();
		
		session.close();
		out.print("Data inserted Successfully");
		
		 
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
