package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1;//declara��o
		c1 = new Conta();//instancia��o
		c1.limite = 100;//inicializa��o
		
		Conta c2;
		c2 = c1;// "=" operador de atribui��o
		c2.limite = 200;//sobre-escrevendo
		//a area de memoria
		
		System.out.println(c1.limite);
		System.out.println(c2.limite);

	}

}
