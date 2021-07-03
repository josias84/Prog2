package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		String url_con = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String password = "root";
		return DriverManager.getConnection(url_con, user, password);
	}
	
	
	


}
