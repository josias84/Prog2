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
				
		if(c1 == c2) {//avalia uma express�o logicas
			System.out.println("As contas s�o iguais");
		}else {
			System.out.println("As contas N�o s�o iguais");
		}
		int i;//declara��o
		int j;//declara��o
		i=2;//inicializa��o
		j=2;//inicializa��o

		if(i == j) {//avalia uma express�o logicas
			System.out.println("As contas s�o iguais");
		}else {
			System.out.println("As contas N�o s�o iguais");
		}
		
		
	}

}
