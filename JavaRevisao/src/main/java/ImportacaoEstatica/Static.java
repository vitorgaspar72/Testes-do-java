package ImportacaoEstatica;

import static java.lang.Math.pow; //importa o método estático, agora nao precisa sempre digitar Math.pow
import static java.lang.Math.PI;
import static java.lang.Math.sqrt; // raiz quadrada
import static java.lang.Math.cos; // seno

public class Static {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 2;
		
		
		double num3 = pow(num1,num2);
		System.out.println(num3);
		System.out.println(sqrt(num1));
	}

}
