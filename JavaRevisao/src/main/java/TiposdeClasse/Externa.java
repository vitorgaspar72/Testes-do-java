package TiposdeClasse;

public class Externa {
	private String texto = "Texto externo";
	
	public class Interna{
		private String texto = "Texto interno";
		
		public void escreve() {
			System.out.println(texto);
			
			System.out.println(Externa.this.texto); // Acessa os atributos da classe externa
		}
	}
}
