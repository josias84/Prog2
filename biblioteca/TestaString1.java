package biblioteca;

public class TestaString1 {

	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = "Java ADS na veia";
		//String b = "Java ADS na veia";
		//int a = 2; //tipo primitivo, o comprimento eh difrente
		//int b = 2 //tipo primitivo, o comprimento eh diferente
		if(a == b) {//na verdade para objetos ele compara o hash
			System.out.println("a e b s�o iguais (testa o objeto)");
		}else {
			System.out.println("a e b s�o objetos diferentes");
		}
		//se quero comparar o conteudo de um obj String, tenho que usar equals
//		if(a.equals(b)) {//testa o conte�do do obj String
//			System.out.println("a e b s�o objetos diferentes");
//		}else {
//			System.out.println("a e b s�o objetos diferentes");
			
//		}
	}

}
