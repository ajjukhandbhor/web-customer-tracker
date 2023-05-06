package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestDbServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user = "springstudent";
		
		String password = "springstudent";
		
		String jdbcurl ="jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out =response.getWriter();
			
			out.println("connecting to db "+jdbcurl);
			
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(jdbcurl,user,password);
			
			out.println("Success");
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
