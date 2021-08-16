package TiposdeClasse;

public class ClasseAnonima {
	public void imprimeTexto() {
		System.out.println("Primeira impressão de classe anonima");
	}
	
	
	public static void main(String[] args) {
		ClasseAnonima teste = new ClasseAnonima(){
			public void imprimeTexto() {
				System.out.println("Segunda Impressão de classe anonima"); //Sobrescrevendo o metodo publico da classe
			}
		};
		
		teste.imprimeTexto(); 
		
		
		InterfaceAnonima teste2 = new InterfaceAnonima() { //Sobrescrevendo de forma anonima a interface

			@Override
			public void testeHeranca() {
				System.out.println("Estou sobrescrevendo a interface como forma anonima");
				
			}
			
		};
	}

}
