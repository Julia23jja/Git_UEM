package ejer5;

import java.util.Scanner;

public class Mayusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de letras");
		String cadena = sc.nextLine();

		System.out.println(cadena.toUpperCase());
		
		System.out.println("Todas las letras están en mayúsculas");
		
		sc.close();

	}

}
