package regrasdenegocio_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import persistence.ConnectionFactory;

public class JdbcInsere {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			
			String sql = "insert into contatos (nome, email, endereco) values (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "Josias");
			stmt.setString(2, "josias@josias.com");
			stmt.setString(3, "Av Brasil, 1000");
			
			stmt.execute();
			stmt.close();

			System.out.println("Gravação feita com sucesso");
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
