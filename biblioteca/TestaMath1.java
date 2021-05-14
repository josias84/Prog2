package biblioteca;

import javax.print.attribute.SetOfIntegerSyntax;

public class TestaMath1 {

	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.15000;
		System.out.println(d1);
		double d2 = 4.000;
		System.out.println(d2);
		double d3 = Math.round(d1);
		System.out.println(d3);
		
		double d4 = Math.max(d1, d3);
		System.out.println(d4);
		
		//tarefas para a turma:
		//implementar e testar Math.min()
		
		double d100 = 9.54697;
		double d101 = 20.56487;
		System.out.print("Math.min=");
		double d102 = Math.min(d100, d101);
		System.out.println(d102);
		
		
		//funções ceil e floor
		System.out.println(Math.ceil(d1));
		double d5 = 4.999999999999;
		System.out.println(Math.floor(d5));
		
		//implementar >>TestaMath2 Math.exp,
		double d104 = 2;
		System.out.print("Math.exp=");
		System.out.println(Math.exp(d104));
		
		//Math.log
		double d105 = 10;
		System.out.print("Math.log=");
		System.out.println(Math.log(d105));
		
		//Math.pow
		double d106 = 7;
		double d107 = 3;
		System.out.print("Math.pow=");
		System.out.println(Math.pow(d106, d107));
		
		//Math.sqrt
		double d108 = 9;
		System.out.print("Math.sqrt=");
		System.out.println(Math.sqrt(d108));
		
		
	}

}
