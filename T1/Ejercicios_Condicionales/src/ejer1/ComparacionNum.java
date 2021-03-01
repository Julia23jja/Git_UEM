package ejer1;

import java.util.Scanner;

public class ComparacionNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce otro número");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
		} else {
			System.out.println(n1 + " no es mayor que "+n2);
		} 
		
		sc.close();

	}

}
