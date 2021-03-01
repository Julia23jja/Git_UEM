package ejer16;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el resultado del dado: ");
		int dado = Integer.parseInt(sc.nextLine());
		
		//OPCION 1
		if (dado == 1) {
			System.out.println("Cara opuesta: Seis");
		}
		
		if (dado == 2) {
			System.out.println("Cara opuesta: Cinco");
		}
		
		if (dado == 3) {
			System.out.println("Cara opuesta: Cuatro");
		}
		
		//OPCION 2
		if (dado == 6) {
			System.out.println("Cara opuesta: Uno");
		}
		
		if (dado == 5) {
			System.out.println("Cara opuesta: Dos");
		}
		
		if (dado == 4) {
			System.out.println("Cara opuesta: Tres");
		}
		
		if (dado < 1) {
			System.out.println("ERROR: número incorrecto");
		} else if (dado > 6) {
			System.out.println("ERROR: número incorrecto");
		}
		
		sc.close();

	}

}
