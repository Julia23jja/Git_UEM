package ejercicio16;

import java.text.NumberFormat;
import java.util.Scanner;

public class Dinero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de monedas de 2€: ");
		double dos = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de monedas de 1€: ");
		double uno = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de monedas de 0.50€: ");
		double cincuenta = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de monedas de 0.20€: ");
		double veinte = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de monedas de 0.10€: ");
		double diez = sc.nextDouble();
		
		double dineroTotal = ((dos * 2) + (uno * 1) + (cincuenta * .5) + (veinte * .2) + (diez * 0.1));
		
		NumberFormat dinero = NumberFormat.getCurrencyInstance();
		
		System.out.println("Este es el dinero total: " + dinero.format(dineroTotal));
		sc.close();
	}

}
