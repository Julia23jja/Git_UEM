package ejercicio14;

import java.util.Scanner;

public class Iniciales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		String nom = sc.nextLine();
		
		System.out.println("Introduce el primer apellido: ");
		String ape1 = sc.nextLine();
		
		System.out.println("Introduce el segundo apellido: ");
		String ape2 = sc.nextLine();
		
		System.out.println("Estas son las iniciales " + nom.substring(0, 1) + " - " + ape1.substring(0, 1) + " - " + ape2.substring(0, 1));
		
		
		
		
		
		sc.close();
		

	}

}
