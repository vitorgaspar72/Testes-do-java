package TiposdeClasse;

import TiposdeClasse.Externa.Interna;

public class TesteExterno {

	public static void main(String[] args) {
		Externa externa = new Externa(); //Classe externa
		Interna interna = externa.new Interna(); // Para instanciar uma classe interna de outra
	}

}
