package Varargs;

public class VarArgs {

	public static void main(String[] args) {
		// Passar vários parametros pra um método
		
		int[] teste = {10,20,30,40,50};
		
		System.out.println(somatorio(teste));

	}
	
	static int somatorio(int [] vetor) {
		int total = 0;
		for(int i =0;i<vetor.length;i++) {
			total = vetor[i]+total;
		}
		
		return total;
	}

}
