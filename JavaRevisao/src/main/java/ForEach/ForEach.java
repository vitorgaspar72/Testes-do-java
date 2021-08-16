package ForEach;

import java.util.ArrayList;
import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int notas [] = new int[9];
		
		Random aleatorio = new Random();
		
	
		for(int i=0;i<notas.length;i++) {
			notas[i]= aleatorio.nextInt(10);
		}
		
		for(int nota:notas) {
			System.out.println("\n numero "+nota);
		}

	}

}
