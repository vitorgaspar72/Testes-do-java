package Enumeradores;

public class ValueOf {

	public static void main(String[] args) {
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO"); // Pega o valor da variavel enum domingo
		
		System.out.println(dia);
	}

}
