package view_testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import model.Contato;
import regrasdenegocio_dao.ContatoDao;

public class TestaDaoPesquisarPorPrimeiraLetra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a letra inicial: ");
		char ps = sc.next().charAt(0);
		
		try {
				ContatoDao dao = new ContatoDao();
				List<Contato> contatos = dao.pesquisarPorPrimeiraLetra(ps);
				for(Contato contato : contatos) {
					System.out.println("Nome: "+contato.getNome());
					System.out.println("Email: "+contato.getEmail());
					System.out.println("Endereço: "+contato.getEndereco());
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
