package BreakAndContinue;

import java.awt.List;
import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		int a = tec.nextInt();
		
		while(a % 2 == 1) {
			System.out.println("\nnumero"+a);
			a+=2;
			
			if(a>=10) {
				System.out.println("\nAcabando a repetição");
				break; // sai do laço de repetição
			}
		}
		
		while(a%2==0) {
			System.out.println("\nnumero"+a);
			a+=2;
			
			if(a>=10) {
				System.out.println("Acabando a repetição2");
				break;
			}
		}

	}

}
