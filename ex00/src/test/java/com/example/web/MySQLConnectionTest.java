package com.example.web;

import java.sql.DriverManager;
import org.junit.Test;

import com.mysql.jdbc.Connection;

public class MySQLConnectionTest {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String USER = "journee";
	private static final String PW = "password";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = (Connection) DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
