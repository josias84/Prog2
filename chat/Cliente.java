package chat;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		
		try {
		//Declaração e criação do soket com recurso desejado na porta
		Socket cliente = new Socket("127.0.0.1", 10000);
		
		Scanner teclado = new Scanner(System.in);
		Scanner chegada = new Scanner(cliente.getInputStream());
		
		// Fluxo de dados pra envio 
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		String msg = "";
		do {
			System.out.println("Informe a mensagem a ser enviada: ");
			msg = teclado.nextLine();
			saida.println(msg);
			// Mandei a mensagem para o servidor
			String resposta = chegada.nextLine();
			System.out.println("A resposta para mensagem ("+ msg +")"
					+ "é "+ resposta);
			System.out.println("/---------------------------/");
		}while(msg.length() != 0);
		
		cliente.close();
		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a conexao");
		}
		 

	}

}
