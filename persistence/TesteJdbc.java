package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TesteJdbc {
	public static void main(String[] args) {
		try {
			String url_con = "jdbc:mysql://127.0.0.1/test";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url_con, user, password);
			System.out.println("Ok, conectado ao Banco");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
