//Algoritmo que pida n�meros hasta que se introduzca un cero. Debe imprimir la suma
// y la media de todos los n�meros introducidos.

package Ejercicio2;

import java.util.Scanner;

public class Opcion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce la cantidad de n�meros a introducir ");
		int cant = Integer.parseInt(sc.nextLine());
		
		int suma = 0;
		int media = 0;
		int num = 0;
		
		for (int i = 0 ; i < cant; i++) {
			System.out.println("Introduce un n�mero: ");
			num = Integer.parseInt(sc.nextLine());
			suma = suma + num;
			media = suma / cant;
		}
		
		System.out.println("La suma de los n�meros introducidos = " + suma);
		System.out.println("La media de los n�meros introducidos = " + media);
		
		
		sc.close();


	}

}
