package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/LectureEvaluation";
			String dbId = "root";
			String dbPassword = "rlworlwo1!";
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection(dbURL, dbId, dbPassword);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}
