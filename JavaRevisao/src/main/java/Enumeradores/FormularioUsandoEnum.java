package Enumeradores;

public class FormularioUsandoEnum {
	enum Genero{
		FEMININ0('F'),MASCULINO('M');
		
		private char genero;
		
		Genero(char genero){
			this.genero = genero;
		}
	
	}
}
