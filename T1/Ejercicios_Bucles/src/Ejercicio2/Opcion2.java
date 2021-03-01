//Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma
// y la media de todos los números introducidos.

package Ejercicio2;

import java.util.Scanner;

public class Opcion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce la cantidad de números a introducir ");
		int cant = Integer.parseInt(sc.nextLine());
		
		int suma = 0;
		int media = 0;
		int num = 0;
		
		for (int i = 0 ; i < cant; i++) {
			System.out.println("Introduce un número: ");
			num = Integer.parseInt(sc.nextLine());
			suma = suma + num;
			media = suma / cant;
		}
		
		System.out.println("La suma de los números introducidos = " + suma);
		System.out.println("La media de los números introducidos = " + media);
		
		
		sc.close();


	}

}
