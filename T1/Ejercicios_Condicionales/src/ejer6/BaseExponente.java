package ejer6;

import java.util.Scanner;

public class BaseExponente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		double base = sc.nextDouble();

		System.out.println("Introduce el exponente");
		double exponente = sc.nextDouble();

		double resultado;
		
		if (exponente == 0) {
			resultado = 1;
			System.out.println("Este es el resultado= " + resultado);

		} else if (exponente < 0) {
			resultado = 1 / Math.pow(base, exponente);
			System.out.println("Este es el resultado= " + resultado);
		} else {
			resultado = base * exponente;
			System.out.println("Este es el resultado= " + resultado);
		}
		sc.close();

	}

}
