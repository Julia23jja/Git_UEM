/*
EJ 3 
Crea una aplicaci�n que permita adivinar un n�mero. La aplicaci�n genera un 
n�mero aleatorio del 1 al 20. A continuaci�n va pidiendo n�meros y va 
respondiendo si el n�mero a adivinar es mayor o menor que el introducido,
a dem�s de los intentos que te quedan (tienes 5 intentos para acertarlo). 
El programa termina cuando se acierta el n�mero (adem�s te dice en cuantos 
intentos lo has acertado), si se llega al limite de intentos te muestra el 
n�mero que hab�a generado.
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
		
		System.out.println("Ya se ha creado el n�mero aleatorio, �adelante!");
		
		System.out.println("Introduce un n�mero");
		int num = Integer.parseInt(sc.nextLine());
		
		int cont = 0;

		while (num != numAlea && cont < 4) {
			if (num < numAlea) {
				System.out.println("El n�mero es mayor");
				System.out.println("Introduce otro n�mero: ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("El n�mero es menor");
				System.out.println("Introduce otro n�mero: ");
				num = Integer.parseInt(sc.nextLine());
			}
			cont++;
			System.out.println("Te quedan " + (4 - cont) + " intentos");
		}
		
		if (cont == 4) {
			System.out.println("�No lo has adivinado! Prueba otra vez");
		}
		
		if (num == numAlea) {
			System.out.println("�GENIAL! Has adivinado el n�mero, y lo has hecho en " + (cont + 1) + " intentos");
		}
		
		
		
		sc.close();

	}

}
