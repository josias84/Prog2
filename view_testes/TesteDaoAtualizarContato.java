package view_testes;

import java.util.List;
import java.util.Scanner;

import model.Contato;
import regrasdenegocio_dao.ContatoDao;

public class TesteDaoAtualizarContato {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();
	
		System.out.println("Insira o id:");
		Long id = Long.parseLong(sc.nextLine());
		try {
				ContatoDao contatoDao = new ContatoDao();
				List<Contato> contatos = contatoDao.pesquisarPorId(id);
				for (Contato nomeContato : contatos) {
					System.out.println("Nome: "+nomeContato.getNome()+"\nEmail"+nomeContato.getEmail()+"\nEnderešo:"+nomeContato.getEndereco());
					System.out.println("_");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Digite o novo nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o novo email:");
		String email = sc.nextLine();
		
		System.out.println("Digite o novo enderešo:");
		String endereco = sc.nextLine();
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		
		try {
				ContatoDao contatoDao = new ContatoDao();
				contatoDao.atualizarContato(contato, id);
				System.out.println("Ok");
				
				List<Contato> contatos = contatoDao.getLista();
				for (Contato nomeContato : contatos) {
					System.out.println("Nome: "+nomeContato.getNome()+"\nEmail"+nomeContato.getEmail()+"\nEnderešo:"+nomeContato.getEndereco());
					System.out.println("_");
				}
		} catch (Exception e) {
				e.printStackTrace();
		}
		sc.close();

	}
}
