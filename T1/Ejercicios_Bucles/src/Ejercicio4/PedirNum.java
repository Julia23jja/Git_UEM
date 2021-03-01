/*
EJ 4
Realizar un algoritmo que pida n�meros (se pedir� por teclado la cantidad de 
n�meros a introducir). El programa debe informar de cuantos n�meros introducidos 
son mayores que 0, menores que 0 e iguales a 0.
 */

package Ejercicio4;

import java.util.Scanner;

public class PedirNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de n�meros a analizar");
		int cant = Integer.parseInt(sc.nextLine());
		
		int num;
		int mayores = 0;
		int menores = 0;
		int ceros = 0;
		
		for (int i = 0; i < cant; i++) {
			System.out.println("Introduce un n�mero: ");
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
