package Enumeradores;

public class TesteDocumento {

	public static void main(String[] args) {
		// Testar gerador de CPF e cnpj com enumeradores
		
		/*for(TipoDocumento tipo : TipoDocumento.values()) {
			System.out.println(tipo+" - "+tipo.geraCnpjCpf()); // Vai gerar o CPF e CNPJ que estiver na classe enumeradora
		}*/
		
		PessoaDocumento pf = new PessoaDocumento();
		
		pf.setTipoDocumento("CPF");
		pf.setNomeDocumento(TipoDocumento.CPF.geraCnpjCpf());
		System.out.println(pf);
		
		PessoaDocumento pj = new PessoaDocumento();
		pj.setTipoDocumento("CNPJ");
		pj.setNomeDocumento(TipoDocumento.CNPJ.geraCnpjCpf());
		System.out.println(pj);
		
		
		
	}

	

	
}
