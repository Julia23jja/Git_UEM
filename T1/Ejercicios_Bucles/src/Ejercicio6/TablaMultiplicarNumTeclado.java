/*
EJ 6
Realizar una algoritmo que muestre la tabla de multiplicar de un número 
introducido por teclado.
 */

package Ejercicio6;

import java.util.Scanner;

public class TablaMultiplicarNumTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número para mostrar su tabla de multiplicar");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		sc.close();

	}

}
