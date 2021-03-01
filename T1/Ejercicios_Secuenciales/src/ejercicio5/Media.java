package ejercicio5;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//Variables
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double media;
		
		//Pedir datos Usuario
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el primer número");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo número");
			n2 = sc.nextDouble();
			System.out.println("Introduce el tercer número");
			n3 = sc.nextDouble();
		
			media = (n1 + n2 + n3) / 3;
					
			System.out.println("Esta es la media " + media);
		
		sc.close();

	}

}
