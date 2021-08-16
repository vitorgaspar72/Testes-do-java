package PrintF;

import ParametroEReferencia.Contato;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.println("Essa é uma String");
		
		
		System.out.printf("Teste de texto %s"," para o Java"); // vai juntar os textos
		System.out.println();
        System.out.printf("%S","Teste de caixa alta"); //deixa o texto em caixa alta
        System.out.println();
        
        System.out.printf("%c",'c'); // escreve um caracter
        System.out.println();
        System.out.printf("%C",'c'); // escreve o caracter em maiúsculo
        
        
        System.out.printf("%n"); // pula uma linha
        System.out.printf("%S","teste para quebra de linha");
        System.out.println();
        
        int valor = -1209830129;
        System.out.printf("%d",valor);  //imprime valor inteiro
        System.out.println();
        
        
        double decimal = 2123.0233129d;
        System.out.printf("%f",decimal); //imprime double com arredondamento
        System.out.println();
        
        String teste = "Olha eu aqui!";
        System.out.printf("%21s",teste); //escreve o maximo de caracteres, se tiver mais que o valor da String converte em espaço
        System.out.println();
        
        
        String teste2 = "Olha eu aqui!";
        System.out.printf("%-21s",teste2); //escreve o maximo de caracteres, se tiver mais que o valor da String converte em espaço para direita
        System.out.println();
        
        
        System.out.printf("%+d",valor); //informa sempre o valor com um sinal de +
        System.out.println();
        
        System.out.printf("%020d",valor); //Preenche a esquerda sempre com zeros do numero para atender a condicao de 20 digitos ou etc
        System.out.println();
        
        
        System.out.printf("%,d",valor); //Separa as casas de milhares
        System.out.println();
        
        
        System.out.printf("%.3f",decimal); //coloca 3 casas decimais após a virgula com arredondamento
        System.out.println();
        
        
        System.out.printf("R$%.2f",decimal); //converte para monetario com arredondamento de virgula
        
        
        
	}

}
