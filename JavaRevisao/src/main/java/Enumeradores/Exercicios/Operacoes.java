package Enumeradores.Exercicios;

public enum Operacoes {
	SOMA("+") {
		@Override
		public void executarOperacao(double x, double y) {
			System.out.println("Resultado da Soma é: "+(x+y));
			
		}
	},SUBTRACAO("-") {
		@Override
		public void executarOperacao(double x, double y) {
			System.out.println("Resultado da Subtração é: "+(x-y));
			
		}
	},MULTIPLICACAO("*") {
		@Override
		public void executarOperacao(double x, double y) {
			System.out.println("Resultado da Multiplicação é: "+(x*y));
			
		}
	},DIVISAO("/") {
		@Override
		public void executarOperacao(double x, double y) {
			System.out.println("Resultado da Divisão é: "+(x/y));

			
		}
	};
	
	public String op;
	Operacoes(String op) {
		this.op = op;
	}
	public String toString() {
		return op;
	}
	
	public abstract void executarOperacao(double x, double y);
}
