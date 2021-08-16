package Enumeradores;

public class Value {

	public static void main(String[] args) {
		DiaSemana [] dias = DiaSemana.values(); // array dias recebe os valores do enum DiaSemana
		
		for(int i = 0; i<dias.length;i++) {
			System.out.println(dias[i]);
		}
		
		for(DiaSemana dia : dias) {
			System.out.println(dia);
		}

	}

}
