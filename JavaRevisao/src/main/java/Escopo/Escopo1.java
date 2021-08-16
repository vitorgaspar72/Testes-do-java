package Escopo;

public class Escopo1 {
	int valor;
	
	public void setValor(int valor /*variavel local do metodo*/) {
		this.valor /*informa a variavel global da classe*/ = valor; //variavel local do metodo
	}
}
