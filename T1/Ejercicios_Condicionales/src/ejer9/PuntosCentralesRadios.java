package ejer9;

import java.util.Scanner;

public class PuntosCentralesRadios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el punto central x1: ");
		double x1 = sc.nextDouble();
		
		System.out.println("Introduce el punto central y1: ");
		double y1 = sc.nextDouble();
		
		System.out.println("Introduce el punto central x2: ");
		double x2 = sc.nextDouble();
		
		System.out.println("Introduce el punto central y2: ");
		double y2 = sc.nextDouble();
		
		System.out.println("Introduce el radio 1: ");
		double r1 = sc.nextDouble();
		
		System.out.println("Introduce el radio 2: ");
		double r2 = sc.nextDouble();
		
		//Calcular la distancia entre las circunferencias
		double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		//CALCULOS
		
		if (distancia > (r1+r2)) {

			System.out.println("Exteriores");

		} else if (distancia == (r1+r2)) {

			System.out.println("Tangentes exteriores");

		} else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {

			System.out.println("Secantes");
		
		} else if (distancia == Math.abs(r1-r2)) {

			System.out.println("Tangentes interiores");

		} else if ((distancia > 0) && distancia < Math.abs(r1-r2)) {

			System.out.println("Interiores");

		} else if (distancia == 0) {

			System.out.println("Concéntricas");

		} 

		sc.close();

	}

}