package ejer11;

import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un año:");
		int anio = Integer.parseInt(sc.nextLine());
		
		if (anio % 4 == 0 || anio % 400 == 0) {
			System.out.println("El año { " + anio + " } es Bisiesto");
		} else if (anio % 100 == 0) {
			System.out.println("El año { " + anio + " } no es Bisiesto");
		}
		
		sc.close();

	}

}
