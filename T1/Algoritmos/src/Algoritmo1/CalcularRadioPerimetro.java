package Algoritmo1;

import java.util.Scanner;

public class CalcularRadioPerimetro {

	public static void main(String[] args) {
		//Definir variables
		double radio = 0;
		double area = 0;
		double perimetro;
		//Definir constantes (van en upper snake case)
		final double PI = 3.1416;
				
		// Para pedir datos al usuario usaremos la clase Scanner
		Scanner sc = new Scanner(System.in);
		//mostramos por pantalla
		System.out.println("Introduzca el radio: ");
		//Recogemos el valor
		radio = sc.nextDouble();
		
		//Calcular el perímetro y radio
		perimetro = PI * 2 * radio;
		area = PI * radio * radio;
		
		System.out.println("El perimetro es: " + perimetro);
		System.out.println("El area es: " + area);
		
		sc.close();
	}

}