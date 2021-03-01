package ejer13;

import java.util.Scanner;

public class Uva {
	
	static final double PRECIO_INI = 0.85 ;

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de uva (Kg)");
		double cant = Double.parseDouble(sc.nextLine());
	
		System.out.println("Introduce tipo de uva");
		String tipo = sc.nextLine();
		
		System.out.println("Introduce tamaño de uva");
		String tamaño = sc.nextLine();
		
		String tipoA = "Tinta";
		String tipoB = "Blanca";
		String tamaño1 = "Pequeña";
		String tamaño2 = "Grande";
		
		
		if (tipo.equals(tipoA) && tamaño.equals(tamaño1)) {
			double resultado1 = cant * (PRECIO_INI + 0.20);
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tamaño1 + " tamaño: " + resultado1);
		} else if (tipo.equals(tipoA) && tamaño.equals(tamaño2)) {
			double resultado2 = cant * (PRECIO_INI + 0.30);
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tamaño2 + " tamaño: " + resultado2);
			
		} else if (tipo.equals(tipoB) && tamaño.equals(tamaño1)) {
			double resultado3 = cant *  (PRECIO_INI - 0.30);
			System.out.println("Este es el precio de la uva " + tipoB + " de " + tamaño1 + " tamaño: " + resultado3);
			
		} else if (tipo.equals(tipoB) && tamaño.equals(tamaño2)) {
			double resultado4 = cant *  (PRECIO_INI - 0.50);
			System.out.println("Este es el precio de la uva " + tipoB + " de " + tamaño2 + " tamaño: " + resultado4);
			
		}
		
		sc.close();

	}

}
