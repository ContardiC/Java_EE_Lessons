package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.UserBean;
import jakarta.servlet.ServletContext;

public class DBManager {
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
	
	public void insertUser(UserBean user) throws Exception {
		Statement statement=null;
		Connection conn=null;
		try {
			conn=getDBConnection();
			conn.setAutoCommit(false);
			statement=conn.createStatement();
			String query = "INSERT INTO users (firstname,lastname,email,password)";			
			query +="VALUES ('"  
			+ user.getFirstName()  + "' , '"
			+ user.getLastName() + "' , '"		
			+ user.getEmail() + "' , '"
			+ user.getPassword() + "')";
			
			System.out.println("Inserimento utente");
			statement.executeUpdate(query);
			conn.commit();
		}catch(SQLException e) {
			if(conn!=null) {
				conn.rollback();
				System.out.println("INSERT ERROR: Transaction is being rolled back");

			}
			
		}finally {
			if(statement != null) {
				statement.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		
	}
	public static UserBean searchUser(String email, String password) throws SQLException {
		PreparedStatement pstmt=null;
		Connection conn=null;
		UserBean userBean = null;
		try {
			userBean=new UserBean();
			conn=getDBConnection();
			pstmt=conn.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
			pstmt.setString(1, email);
			pstmt.setString(2,password);
			ResultSet res=pstmt.executeQuery();
			System.out.println("La query: "+pstmt.toString());
			while(res.next()){
				userBean.setEmail(res.getString("email"));
				userBean.setPassword(res.getString("password"));
			}
		}catch(Exception e) {
			
		}
		return userBean;
	}
	
	
	public static void testConnection() throws Exception {
		getDBConnection();
	}
}
