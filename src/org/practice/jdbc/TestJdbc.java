package org.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false";
		String user ="webstudent";
		String pass="webstudent";
		try {
			System.out.println("Starting the Connection");
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Got the Connection");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
