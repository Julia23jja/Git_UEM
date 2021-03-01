package ejercicio4;

import java.util.Scanner;

public class Grados {

	public static void main(String[] args) {
		//Variables
		double fah;
		double cel;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Introduzca la temperatura en Fahrenheit: ");
			fah = sc.nextDouble();
			
			cel = (fah - 32) / 1.8;
			
			System.out.println("Estos son los grados Celsius: " + cel + "º");
		
		sc.close();

	}

}
