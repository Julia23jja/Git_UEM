/*
Algoritmo que muestre la tabla de multiplicar de los números 
1,2,3,4 y 5.
 */

package Ejercicio8;

public class TablaMultiplicar12345 {

	public static void main(String[] args) {
		for (int cont = 1; cont <= 5; cont++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(cont + " x " + i + " = " + (cont * i));
			}
			System.out.println("\n");

		}

	}

}
