package Enumeradores.Exercicios;

import java.util.Scanner;

public class TesteOperacoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int n1 = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int n2= teclado.nextInt();
		Operacoes[] formas = Operacoes.values();
		for(int i=0;i<formas.length;i++) {
			System.out.println("\nDigite "+(i+1)+" para "+ formas[i]);
		}
		
		int n3 = teclado.nextInt();
		
		switch(n3) {
			case 1 :
				Operacoes.SOMA.executarOperacao(n1, n2);
				break;
			
			case 2: 
				Operacoes.MULTIPLICACAO.executarOperacao(n1, n2);
				break;
			
			case 3:
				float n4 = n1;
				float n5 = n2;
				Operacoes.DIVISAO.executarOperacao(n4, n5);
				break;
				
			case 4:
				Operacoes.SUBTRACAO.executarOperacao(n1, n2);
		}
		
		
	}

}
