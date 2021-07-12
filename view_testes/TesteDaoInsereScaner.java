package view_testes;

import java.util.Scanner;

import model.Contato;
import regrasdenegocio_dao.ContatoDao;

public class TesteDaoInsereScaner {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Contato c1 = new Contato();
		System.out.println("Insira o nome: \n");
		c1.setNome(ler.nextLine());
		System.out.println("Insira o email: \n");
		c1.setEmail(ler.nextLine());
		System.out.println("Insira o endere�o: \n");
		c1.setEndereco("Insira o endere�o: ");
		ler.close();
		
		ContatoDao cdao;
		try {
				cdao = new ContatoDao();
				cdao.adiciona(c1);
				System.out.println("Grava��o realizada.");
		} catch (Exception e) {
			
		}
		

	}

}
