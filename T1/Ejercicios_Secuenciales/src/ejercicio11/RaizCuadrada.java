package ejercicio11;

import java.util.Scanner;

public class RaizCuadrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		double n1 = sc.nextDouble();
		
		double resultado = Math.sqrt(n1);
		
		System.out.println("La ra�z cuadrada de "+n1+" es: " + resultado);
		
		sc.close();

	}

}
