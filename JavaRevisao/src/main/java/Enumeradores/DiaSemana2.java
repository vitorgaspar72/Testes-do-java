package Enumeradores;

public enum DiaSemana2 { // Pode ser uma classe
	 SEGUNDA(1)/*recebe valor no parenteses*/,TERCA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
	
	 private int valor;
	 
	 
	 DiaSemana2(int valor){
		 this.valor = valor;
	 }
	 
	 public int getValor() {
		 return this.valor;
	 }
}
