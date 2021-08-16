package Enumeradores.Exercicios;

public class Enumeradores1 {
	enum Enumeradores{
		NUMERO(10), NUMERO2(20), NUMERO3(30);
		
		private int valor;  // com a variavel declarada, o java busca na classe alguma variavel estatica com aquele valor
		Enumeradores(int valor){
			this.valor = valor;
		}
		
		public int mostra() {
			return valor;
		}
	}

	public static void main(String[] args) {
		Enumeradores[] numero = Enumeradores.values();
		
		System.out.println(numero[2]); //vai escrever o nome da variavel
		System.out.println(Enum.valueOf(Enumeradores.class, "NUMERO3")); //escreve o nome da variavel
		System.out.println(Enumeradores.NUMERO2.valor); // escreve o valor da variavel
		

	}

}
