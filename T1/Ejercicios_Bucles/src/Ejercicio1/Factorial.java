/*
//EJ 1
//Crea una aplicaci�n que pida un n�mero y calcule su factorial (El factorial de 
//un n�mero es el producto de todos los enteros entre 1 y el propio n�mero y se 
//representa por el n�mero seguido de un signo de exclamaci�n. 
//Por ejemplo 5! = 1x2x3x4x5=120)
 */

package Ejercicio1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero entero");
		int num = Integer.parseInt(sc.nextLine());
		
		int factorial = 1;
		
		for (int i = num ; i > 0 ; i--) {
			factorial = factorial * i;
		}
		
		System.out.println(num + "! = " + factorial);
		
		sc.close();

		
	}

}
