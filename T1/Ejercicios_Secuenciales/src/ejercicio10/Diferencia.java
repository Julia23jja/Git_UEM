package ejercicio10;

import java.util.Scanner;

public class Diferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce otro número: ");
		double n2 = sc.nextDouble();
		
		double diferencia;
		
		diferencia = n1 - n2;
		
		diferencia = Math.abs(diferencia);
		
		System.out.println("La diferencia es: " + diferencia);
		
		sc.close();

	}

}