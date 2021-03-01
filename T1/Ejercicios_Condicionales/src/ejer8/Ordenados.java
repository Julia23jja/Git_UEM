package ejer8;

import java.util.Scanner;

public class Ordenados {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		double n1 = sc.nextDouble();		
		
		System.out.println("Introduce otro número");
		double n2 = sc.nextDouble();	
		
		System.out.println("Introduce otro número");
		double n3 = sc.nextDouble();	

		a = n1;
		b = n2;
		c = n3;
		
		//Comparamos el valor 1
		if ( n1 > n2 && n1 > n3) {
			a = n1;
		}
		
		if ( n1 > n2 && n1 < n3) {
			b = n1;
		}
		
		if ( n1 < n2 && n1 > n3) {
			b = n1;
		}
		if (n1 < n2 && n1 < n3) {
			c = n1;
		}
		
		//Comparamos el valor 2
		if ( n2 > n1 && n2 > n3) {
			a = n2;
		}
		
		if ( n2 > n1 && n2 < n3) {
			b = n2;
		}
		
		if ( n2 < n1 && n2 > n3) {
			b = n2;
		}
		if ( n2 < n1 && n2 < n3) {
			c = n2;
		}
		
		//Comparamos el valor 
		if ( n3 > n1 && n3 > n2) {
			a = n3;
		}
		
		if ( n3 > n1 && n3 < n2) {
			b = n3;
		}
		
		if ( n3 < n1 && n3 > n2) {
			b = n3;
		}
		if ( n3 < n1 && n3 < n2) {
			c = n3;
		}
		
		System.out.println("El orden de mayor a menor es: "+ a + " > " + b +" > " + c +" > " );
		sc.close();

	}

}
