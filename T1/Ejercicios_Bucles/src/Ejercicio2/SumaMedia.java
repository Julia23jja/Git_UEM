//Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma
// y la media de todos los números introducidos.

package Ejercicio2;

import java.util.Scanner;

public class SumaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduzca un número entero");
		int num = Integer.parseInt(sc.nextLine());

		double suma = 0;
		double media = 0;
		int cont = 0;
		
		while (num != 0) {
			System.out.println("Introduzca otro número entero(0 para salir): ");
			num = Integer.parseInt(sc.nextLine());
			suma = suma + num;
			cont++;
		}
		
		if (cont != 0 ) {
			media = suma / cont;
		}
		
		System.out.println("Este es el resultado de la suma: " + suma);
		System.out.println("Este es el resultado de la media: " + media);

		sc.close();

	}

}
//REPASAR
