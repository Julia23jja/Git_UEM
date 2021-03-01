package ejer7;

import java.util.Scanner;

public class NotaEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota");
		double nota = sc.nextDouble();
		
		System.out.println("Introduce la edad");
		double edad = sc.nextDouble();
		
		System.out.println("Introduce el sexo F o M");
		String sexo = sc.next();
		
		if (nota >= 5 && edad >= 18 & sexo == "F") {
			System.out.println("\nACEPTADA");
		} else if (nota >= 5 && edad >= 18 & sexo == "M") {
			System.out.println("\nPOSIBLE");
		} else {
			System.out.println("\nNO ACEPTADA");
		}
		sc.close();

	}

}

/*		*/
