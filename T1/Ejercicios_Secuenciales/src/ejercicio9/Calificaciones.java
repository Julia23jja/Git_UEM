package ejercicio9;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer parcial: ");
		double parcial1 = sc.nextDouble();
		
		System.out.println("Introduce la nota del segundo parcial: ");
		double parcial2 = sc.nextDouble();
		
		System.out.println("Introduce la nota del tercer parcial: ");
		double parcial3 = sc.nextDouble();
		
		System.out.println("Introduce la nota del examen final: ");
		double examen = sc.nextDouble();
		
		System.out.println("Introduce la nota del trabajo final: ");
		double trabajo = sc.nextDouble();
		
		double califinal;
		double parciales;
		
		parciales = ((parcial1 + parcial2 + parcial3 ) / 3);
		
		califinal = ((0.55 * parciales) + (0.30 * examen) + (0.15 * trabajo));
		
		System.out.println("Esta es tu calificación final: " + califinal);
		sc.close();
		
		

		

	}

}
