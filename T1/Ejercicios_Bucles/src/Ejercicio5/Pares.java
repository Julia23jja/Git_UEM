/*
Escribir un programa que imprima todos los números pares entre dos números que 
se le pidan al usuario.
 */

package Ejercicio5;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número entero mayor que el anterior: ");
		int num2 = sc.nextInt();

		System.out.println("\nNúmeros pares desde " + num1 + " hasta " + num2 + " : ");
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
