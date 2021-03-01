package ejer3;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		double n1 = sc.nextDouble();

		if (n1 % 2 == 0) {
			System.out.println(n1 + " Es par ");
		} else {
			System.out.println(n1 + " Es impar ");
		}
		
		sc.close();

	}

}
