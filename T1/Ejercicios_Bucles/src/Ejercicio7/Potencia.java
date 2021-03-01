/*
Escribe un programa que dados dos n�meros, uno entero (base) y un entero positivo 
(exponente), saque por pantalla el resultado de la potencia. No se puede 
utilizar el operador de potencia.
 */

package Ejercicio7;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero que ser� la BASE: ");
		int base = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el n�mero que ser� el EXPONENTE: ");
		int exp = Integer.parseInt(sc.nextLine());
		

		int potencia = (int) Math.pow(base, exp);
		
		System.out.println("Este es el resultado de la operaci�n\n" + potencia);
		
		sc.close();

	}

}

