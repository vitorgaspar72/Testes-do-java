package Enumeradores;

public class PessoaDocumento {
	private String tipoDocumento;
	private String nomeDocumento;
	
	public PessoaDocumento() {
		
	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNomeDocumento() {
		return nomeDocumento;
	}
	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}

	@Override
	public String toString() {
		return "PessoaDocumento [tipoDocumento=" + this.getTipoDocumento() + ", nomeDocumento=" + getNomeDocumento() + "]";
	}
	
	
	
	
}
