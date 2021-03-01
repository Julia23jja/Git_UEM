/*
EJ 3 
Crea una aplicación que permita adivinar un número. La aplicación genera un 
número aleatorio del 1 al 20. A continuación va pidiendo números y va 
respondiendo si el número a adivinar es mayor o menor que el introducido,
a demás de los intentos que te quedan (tienes 5 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos 
intentos lo has acertado), si se llega al limite de intentos te muestra el 
número que había generado.
 */

package Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CREAMOS NUM ALEATORIO ENTRE 1 Y 20
		Random rd = new Random ();
		int limSup = 20;
		int limInf = 1;
		
		int numAlea = rd.nextInt(limSup + 1 - limInf) + limInf;
		
		System.out.println("Ya se ha creado el número aleatorio, ¡adelante!");
		
		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());
		
		int cont = 0;

		while (num != numAlea && cont < 4) {
			if (num < numAlea) {
				System.out.println("El número es mayor");
				System.out.println("Introduce otro número: ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("El número es menor");
				System.out.println("Introduce otro número: ");
				num = Integer.parseInt(sc.nextLine());
			}
			cont++;
			System.out.println("Te quedan " + (4 - cont) + " intentos");
		}
		
		if (cont == 4) {
			System.out.println("¡No lo has adivinado! Prueba otra vez");
		}
		
		if (num == numAlea) {
			System.out.println("¡GENIAL! Has adivinado el número, y lo has hecho en " + (cont + 1) + " intentos");
		}
		
		
		
		sc.close();

	}

}
