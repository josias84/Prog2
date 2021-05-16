package tarefaTurma;

public class TestaMath3 {

	public static void main(String[] args) {
		//implementar >>TestaMath3 e ver a diferença de Math.sin
		//e Math.toDegrees, Math.toRadians
		
		/*Retorna o seno trigonométrico de um ângulo. Casos especiais:
	      Se o argumento for NaN ou infinito, o resultado será NaN.
		  Se o argumento for zero, o resultado será um zero com o mesmo 
		  sinal do argumento. O resultado calculado deve estar dentro 
		  de 1 ulp do resultado exato. Os resultados devem ser semimonotônicos.*/
		System.out.println(Math.sin(90));
		
		/*Converte um ângulo medido em radianos em um ângulo 
		 * aproximadamente equivalente medido em graus. 
		 * A conversão de radianos para graus é geralmente inexata;*/
		System.out.println(Math.toDegrees(1));
		
		/* Converte um ângulo medido em graus em um ângulo aproximadamente 
		 *	equivalente medido em radianos. 
		 * 	A conversão de graus em radianos é geralmente inexata.
		 */
		System.out.println(Math.toRadians(90));

		
		



	}

}
