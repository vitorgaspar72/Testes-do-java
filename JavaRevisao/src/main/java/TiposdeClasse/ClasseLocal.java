package TiposdeClasse;

public class ClasseLocal {
	public void testeClasseLocal() {
		class InternaMetodo{
			private String teste = "Teste de classe interna dentro de um método";
			
			public void imprime() {
				System.out.println(teste);
			}
		}
		InternaMetodo testeClasse = new InternaMetodo();
		testeClasse.imprime();
	}
	
	
	
	public static void main (String[]args) {
		ClasseLocal classe = new ClasseLocal();
		classe.testeClasseLocal();
	}
}
