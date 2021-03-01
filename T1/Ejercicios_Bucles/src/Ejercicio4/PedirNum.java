/*
EJ 4
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de 
números a introducir). El programa debe informar de cuantos números introducidos 
son mayores que 0, menores que 0 e iguales a 0.
 */

package Ejercicio4;

import java.util.Scanner;

public class PedirNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de números a analizar");
		int cant = Integer.parseInt(sc.nextLine());
		
		int num;
		int mayores = 0;
		int menores = 0;
		int ceros = 0;
		
		for (int i = 0; i < cant; i++) {
			System.out.println("Introduce un número: ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num < 0) {
				menores++;
			} else if (num > 0) {
				mayores++;
			} else {
				ceros++;
			}
		}
		
		System.out.println("Hay " + mayores + ",mayores; " + menores + ", menores; y " + ceros + " iguales que 0");		
		
		sc.close();

	}

}
