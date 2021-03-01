package bucles.ej2;

import java.util.Scanner;

public class Cero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número ");
		int n1 = Integer.parseInt(sc.nextLine());

		double n2 = 1;
		double suma = 0;
		double cont = 0;
		double media = 0;

		suma = suma + n1;

		while (n2 != 0) {
			System.out.println("Introduce otro número (0 para salir) ");
			n2 = Double.parseDouble(sc.nextLine());

			suma = suma + n2;
			cont++;

			if (n1 == 0) {
				cont--;
			}

		}

		if (cont > 0) {
			media = suma / cont;
		}

		System.out.println("La suma de los números introducidos = " + suma);
		System.out.println("La media de los números introducidos = " + (double) media);

		sc.close();

	}

}