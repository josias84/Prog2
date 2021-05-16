package tarefaTurma;

public class TestaMath3 {

	public static void main(String[] args) {
		//implementar >>TestaMath3 e ver a diferen�a de Math.sin
		//e Math.toDegrees, Math.toRadians
		
		/*Retorna o seno trigonom�trico de um �ngulo. Casos especiais:
	      Se o argumento for NaN ou infinito, o resultado ser� NaN.
		  Se o argumento for zero, o resultado ser� um zero com o mesmo 
		  sinal do argumento. O resultado calculado deve estar dentro 
		  de 1 ulp do resultado exato. Os resultados devem ser semimonot�nicos.*/
		System.out.println(Math.sin(90));
		
		/*Converte um �ngulo medido em radianos em um �ngulo 
		 * aproximadamente equivalente medido em graus. 
		 * A convers�o de radianos para graus � geralmente inexata;*/
		System.out.println(Math.toDegrees(1));
		
		/* Converte um �ngulo medido em graus em um �ngulo aproximadamente 
		 *	equivalente medido em radianos. 
		 * 	A convers�o de graus em radianos � geralmente inexata.
		 */
		System.out.println(Math.toRadians(90));

		
		



	}

}
