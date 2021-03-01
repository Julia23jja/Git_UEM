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
		
		System.out.println("Introduce tama�o de uva");
		String tama�o = sc.nextLine();
		
		String tipoA = "Tinta";
		String tipoB = "Blanca";
		String tama�o1 = "Peque�a";
		String tama�o2 = "Grande";
		
		
		if (tipo.equals(tipoA) && tama�o.equals(tama�o1)) {
			double resultado1 = cant * (PRECIO_INI + 0.20);
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tama�o1 + " tama�o: " + resultado1);
		} else if (tipo.equals(tipoA) && tama�o.equals(tama�o2)) {
			double resultado2 = cant * (PRECIO_INI + 0.30);
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tama�o2 + " tama�o: " + resultado2);
			
		} else if (tipo.equals(tipoB) && tama�o.equals(tama�o1)) {
			double resultado3 = cant *  (PRECIO_INI - 0.30);
			System.out.println("Este es el precio de la uva " + tipoB + " de " + tama�o1 + " tama�o: " + resultado3);
			
		} else if (tipo.equals(tipoB) && tama�o.equals(tama�o2)) {
			double resultado4 = cant *  (PRECIO_INI - 0.50);
			System.out.println("Este es el precio de la uva " + tipoB + " de " + tama�o2 + " tama�o: " + resultado4);
			
		}
		
		sc.close();

	}

}
