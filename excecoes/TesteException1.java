package excecoes;

public class TesteException1 {

	public static void main(String[] args) {
		System.out.println("In�cio do m�todo main");
		metodo1();
		System.out.println("Fim do metodo main");
		

	}

	private static void metodo1() {
		System.out.println("In�cio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	private static void metodo2() {
		System.out.println("In�cio do metodo 2");
		//faz alguma coisa entre o in�cio e o fim do m�todo 2
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