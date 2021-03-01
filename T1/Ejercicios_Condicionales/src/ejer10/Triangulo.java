package ejer10;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce lado 1 (a): ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce lado 2 (b): ");
		double b = sc.nextDouble();
		
		System.out.println("Introduce lado 3 (c): ");
		double c = sc.nextDouble();
		
		double hipotenusa = Math.pow(c, 2);
		double cateto1= Math.pow(a, 2);
		double cateto2= Math.pow(b, 2);
		
		if (hipotenusa == cateto1 + cateto2 ) {
			System.out.println("Tri�ngulo Rect�ngulo");
			
		} else if ( a == b && a != c || b == c && b == c && b != a ) {
			
			System.out.println("Tri�ngulo Is�sceles");
			
		} else if ( a == b && a == c && b == c) {
			
			System.out.println("Tri�ngulo Equil�tero");
			
		} else if ( a != b && a != c && b != c) {
			
			System.out.println("Tri�ngulo Escaleno");
		}
			
		
		
		
		
		
		sc.close();

	}

}
