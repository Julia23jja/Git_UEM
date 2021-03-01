package ejer2;

import java.util.Scanner;

public class Comparacion0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		double n1 = sc.nextDouble();

		if (n1 == 0) {
			System.out.println(n1 + " es igual que 0 ");
		} if (n1 < 0) {
			System.out.println(n1 + " es menor que 0 ");
		} if (n1 > 0){
			System.out.println(n1 + " es mayor que 0 ");
		}
		
		sc.close();

	}

}
