package Enumeradores;

public enum TipoDocumento {
	
	/* Qualquer método incluso no enum, deve ser colocado para cada variável do enum 
	 * O enum le todos os numeros em bloco , essa é a razão pelo método ser abordado em todas as variaveis
	 * A leitura em bloco obriga que se uma variavel possui valor, todas as outras, se existirem, devem possuir tambem
	 * O método dentro da variavel estática é o sobrescrito do abstrato
	 * O valor pode um retorno de metodo
	 * */
	CPF {
		@Override
		public String geraCnpjCpf() {
			// TODO Auto-generated method stud
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraCnpjCpf() {
			// TODO Auto-generated method stub
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraCnpjCpf();
	
}
