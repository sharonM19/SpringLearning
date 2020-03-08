package com.imdb.dbconnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup the connection variables 
		String user = "root";
		String password = "";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/sample?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		
		//get the connection
		try{
			
			PrintWriter out = response.getWriter(); 
			
			out.println("Connecting to the database -->");
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			out.println("SUCCESSFUL!!!");
			
			conn.close();
			
		  }catch(Exception exec) {
			
			exec.printStackTrace();
			throw new ServletException();
		}
		
	}

}
