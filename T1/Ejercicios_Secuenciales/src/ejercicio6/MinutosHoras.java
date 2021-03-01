package ejercicio6;

import java.util.Scanner;

public class MinutosHoras {

	public static void main(String[] args) {
		//Variables
		double minutos;
		double horas;
		
		//Pedir datos usuario
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce los minutos");
			minutos = sc.nextDouble();
			
			horas = minutos / 60;
			System.out.println("Estas son las horas y minutos " + horas + " h " + minutos + " min ");
		sc.close();
	}

}
