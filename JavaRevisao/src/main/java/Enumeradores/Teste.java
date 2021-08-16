package Enumeradores;

public class Teste {

	public static void main(String[] args) {
	   // Enums nao podem ter 'new 'na instanciação
	   // Pode implementar interfaces
		
	   
	   DiaSemana2 dia = DiaSemana2.DOMINGO; // Método 2
	   DiaSemana2 dia2 = DiaSemana2.SEGUNDA;
	   
	   System.out.println(dia2.toString()+ " - "+ dia2.getValor());
	}
	
	private static void usandoConstante() {
		int segunda = Enumeradores.SEGUNDA;
		int terca = Enumeradores.TERCA;
		int quarta = Enumeradores.QUARTA;
		int quinta = Enumeradores.QUINTA;
		int sexta = Enumeradores.SEXTA;
		int sabado = Enumeradores.SABADO;
		int domingo = Enumeradores.DOMINGO;
		
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch(dia) {
			case SEGUNDA:
				System.out.println("Segunda-Feira");
				break;
				
			case TERCA:
				System.out.println("Terça-Feira");
				break;
			
			case QUARTA:
				System.out.println("Quarta-Feira");
				break;
			
			case QUINTA:
				System.out.println("Quinta-Feira");
				break;
				
			case SEXTA:
				System.out.println("Sexta-Feira");
				break;
				
			case SABADO:
				System.out.println("Sábado");
				break;
			
			case DOMINGO:
				System.out.println("Domingo");
				break;
		}
	}
	
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);

	}

}
