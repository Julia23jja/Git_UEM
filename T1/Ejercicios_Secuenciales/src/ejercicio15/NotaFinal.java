package ejercicio15;

import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las respuestas correctas: ");
		double correctas = sc.nextDouble();
		
		System.out.println("Introduce las respuestas incorrectas: ");
		double incorrectas = sc.nextDouble();
		
		System.out.println("Introduce las respuestas sin contestar: ");
		double blanco = sc.nextDouble();
		
		double tCorrectas = 5 * correctas;
		double tIncorrectas = (-1) * incorrectas;
		double tBlanco = 0 * blanco;
		
		double notaFinal = tCorrectas + tIncorrectas + tBlanco;
		
		System.out.println("Estos son los puntos finales considerando los datos anteriores: " + notaFinal);
		
		sc.close();

	}

}
