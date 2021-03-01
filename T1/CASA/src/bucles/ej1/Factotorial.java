package bucles.ej1;

import java.util.Scanner;

public class Factotorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		int factorial = 1;
		
		for (int i = num ; i > 0 ; i--) {
			factorial = factorial * i;
		}
		
		System.out.println(num + "! = " + factorial);

		sc.close();

	}

}
