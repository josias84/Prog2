package excecoes;

public class TesteException1 {

	public static void main(String[] args) {
		System.out.println("Início do método main");
		metodo1();
		System.out.println("Fim do metodo main");
		

	}

	private static void metodo1() {
		System.out.println("Início do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	private static void metodo2() {
		System.out.println("Início do metodo 2");
		//faz alguma coisa entre o início e o fim do método 2
		int array[] = new int[10];
		try {
			for (int i = 0; i < 20; i++) {
				array[i] = 1;
				System.out.println(i);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro pego (cathed): "+e);
		}
//		for (int i = 0; i < 20; i++) {
//			array[i] = 1;
//			System.out.println(i);
//		}
		System.out.println("Fim do metodo 2");

	}
}