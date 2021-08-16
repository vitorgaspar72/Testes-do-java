package Garbage;

import ParametroEReferencia.Contato;

public class ColetorLixo {
	
	public static void memoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime memoria = Runtime.getRuntime();
		
		System.out.println((memoria.totalMemory() - memoria.freeMemory())/MB);
	}
	
	
	public static void main(String[] args) {
	
		Contato[] contato = new Contato[400000];
		
		for(int i=0;i<contato.length;i++) {
			Contato contatos = new Contato("Vitor"+i,"vgvitor"+i,"619928"+i);
			contato[i]=contatos;
			
		}
		
		System.out.println("Contatos criados: ");
		
		memoriaUsada(); 
		
		contato = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc(); // Força o garbage collector a otimizar a memoria
		
		System.out.println("Contatos removidos da memoria: ");
		memoriaUsada();
	}
}
