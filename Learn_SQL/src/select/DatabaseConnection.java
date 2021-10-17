package select;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String url = 
			"jdbc:postgresql://localhost:5432/dvdrental";
	private static final String username = "postgres";
	private static final String password = "bigelephant";
	
	public static Connection getConnection() {
		Connection cnt = null;
		try {
			cnt = DriverManager.getConnection(url, username, password);
			return cnt;
		} catch (Exception e) {
			return null;
		}
	}

}
