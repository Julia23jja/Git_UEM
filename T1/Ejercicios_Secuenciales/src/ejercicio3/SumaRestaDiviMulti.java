package ejercicio3;

import java.util.Scanner;

public class SumaRestaDiviMulti {

	public static void main(String[] args) {
		//Variables
		double n1 = 0;
		double n2 = 0;
		double suma;
		double resta;
		double division;
		double multiplicacion;
		
		//Pedimos datos al usuario
		Scanner sc = new Scanner(System.in);
		//Mostrar datos
		System.out.println("Introduce el primer número");
		//Recoger
		n1 = sc.nextDouble();
		//Mostrar datos
		System.out.println("Introduce el segundo número");
		//Recoger
		n2 = sc.nextDouble();
		
		//Hacemos las operaciones
		suma = n1 + n2;
		resta = n1 - n2;
		multiplicacion = n1 * n2;
		division = n1 / n2;
		
		//Mostramos resultados
		System.out.println("Este es el resultado de la suma " + suma);
		System.out.println("Este es el resultado de la resta " + resta);
		System.out.println("Este es el resultado de la división " + division);
		System.out.println("Este es el resultado de la multiplicación " + multiplicacion);
		
		
		
		
		
		
		sc.close();

	}

}
