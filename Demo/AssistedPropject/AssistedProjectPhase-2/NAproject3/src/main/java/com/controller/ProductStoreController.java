package com.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductStoreController
 */
public class ProductStoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStoreController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 PrintWriter pw = response.getWriter();
			
			response.setContentType("text/html");
			
			int pid = Integer.parseInt(request.getParameter("pid"));
			String pname = request.getParameter("pname");
			float price = Float.parseFloat(request.getParameter("price"));
			
			Product p = new Product();
			p.setPid(pid);
			p.setPname(pname);
			p.setPrice(price);
			
			ProductService ps = new ProductService();
			
			String result = ps.storeProduct(p);
			
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
	}

	

}
