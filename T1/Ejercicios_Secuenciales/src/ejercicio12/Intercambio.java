package ejercicio12;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce otro n�mero: ");
		double n2 = sc.nextDouble();
		
		double n1_2 = n1;
		double n2_2 = n2;
		
		n1 = n2_2;
		System.out.println("Ahora el primer n�mero es igual a " + n1);
		
		n2 = n1_2;
		System.out.println("Ahora el segundo n�mero es igual a " + n2);
		
		sc.close();

	}

}
