package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:8889/myappdb";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	private static Connection getDBConnection() throws Exception {
		Connection dbConnection=null;
		try {
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			System.out.println("Driver NOT FOUND");
			throw new Exception(e.getMessage());
			
		}
		try {
			dbConnection=DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
			System.out.println("Connection OK");
			
		}catch(SQLException e) {
			System.out.println("Connection FAILED");
			throw new SQLException(e.getErrorCode()+""); 

		}
	
		return dbConnection;
	}
	public static void testConnection() throws Exception {
		getDBConnection();
	}
}
