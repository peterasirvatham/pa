package com.pa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	final String CONNECTION_URL = "jdbc:mysql://localhost:3306/";
	final String DB = "test";
	final String DB_USER = "root";
	final String DB_PWD = "root";

	/**
	 * CREATE TABLE Student( ID INT NOT NULL , NAME
	 * VARCHAR(20) NOT NULL, AGE INT NOT NULL, PRIMARY KEY (ID) );
	 **/
	
	public static void main(String a[]) {
		JdbcConnection jdbc = new JdbcConnection();
		Connection conn = jdbc.getConnection();
		jdbc.insertRecord(conn);
		jdbc.getRecords(conn);
	}

	private Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(CONNECTION_URL + DB, DB_USER, DB_PWD);
			System.out.println("Created DB Connection....");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void insertRecord(Connection con) {
		try {
			Statement st = con.createStatement();
			String sql = "INSERT INTO Student VALUES (101, 'Jii', 18)";
			int val = st.executeUpdate(sql);
			System.out.println("1 row affected");
		} catch (SQLException s) {
			System.out.println("SQL statement is not executed!" + s);
		}
	}

	private void getRecords(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "SELECT id, name, age FROM Student";
			ResultSet rs = stmt.executeQuery(sql);
			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", First: " + name);
				System.out.println(", Age: " + age);

			}
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}
}
