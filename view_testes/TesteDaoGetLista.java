package view_testes;

import java.sql.SQLException;
import java.util.List;

import model.Contato;
import regrasdenegocio_dao.ContatoDao;

public class TesteDaoGetLista {

	public static void main(String[] args) {
		try {
			ContatoDao cdao = new ContatoDao();
			List<Contato> contatos = cdao.getLista();
			
			System.out.println(contatos);

			for (Contato contato : contatos) {
				System.out.println("----------------------");
				System.out.println("Nome: "+contato.getNome());
				System.out.println("E-mail: "+contato.getEmail());
				System.out.println("Endereço: "+contato.getEndereco());

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
