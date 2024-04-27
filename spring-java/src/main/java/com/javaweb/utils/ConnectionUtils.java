package com.javaweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {
	private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/estatebasic";
	private static String USER = "root";
	private static String PASS = "123456";

	public static final Connection getConnection() {
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
