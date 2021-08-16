package BreakAndContinue;

public class Continue {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println("\nNumero "+i);
			
			
			if(i%2==0) {
				System.out.println("\nEste número "+i+" é par");
				continue; //faz com que suba para o começo do loop, todo o escopo de baixo é descartado
			}
			
			
			
		}
		
	}
}
