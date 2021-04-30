package ooavc;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Rodrigo";
		c1.nome = "Rodrigo";
		
		Conta c2 = new Conta();
		c2.nome = "Rodrigo";
		c2.nome = "Rodrigo";
		
		c1 = c2;
				
		if(c1 == c2) {//avalia uma expressão logicas
			System.out.println("As contas são iguais");
		}else {
			System.out.println("As contas Não são iguais");
		}
		int i;//declaração
		int j;//declaração
		i=2;//inicialização
		j=2;//inicialização

		if(i == j) {//avalia uma expressão logicas
			System.out.println("As contas são iguais");
		}else {
			System.out.println("As contas Não são iguais");
		}
		
		
	}

}
