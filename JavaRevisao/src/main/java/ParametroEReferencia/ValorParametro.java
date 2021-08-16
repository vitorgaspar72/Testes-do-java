package ParametroEReferencia;

public class ValorParametro {

	public static void main(String[] args) {
		Contato contato = new Contato("Vitor Gabriel","61996280717","vgvitor@hotmail.com");
		int valor = 1000;
		
		System.out.println(contato);
		System.out.println(valor);
		
		testeValorPassagem1(valor,contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		testeValorPassagem2(valor,contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testeValorPassagem1(int valor, Contato contato) {
		int novovalor = valor +1000;
		valor = novovalor;
		
		contato =new Contato("Maria Leni","61985545768","phgr2005@hotmail.com");// nao vai mudar a saída no system out porque nao muda a pilha na memoria que está o objeto anterior
        System.out.println(contato);
	}
	
	private static void testeValorPassagem2(int valor,Contato contato) {
		int novovalor = valor +1000;
		valor = novovalor;
		
		contato.setNome("Maria Leni"); // vai mudar os parametros
		// vai funcionar porque criou uma nova pilha na memoria
		contato.setEmail("phgr2005@hotmail.com");
		contato.setTelefone("61985545768");
	}

}
