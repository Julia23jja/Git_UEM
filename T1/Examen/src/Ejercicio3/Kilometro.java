package Ejercicio3;

public class Kilometro {

	public static void main(String[] args) {

		int km1 = 70;
		int km2 = 150;

		while (km1 != km2) {
			km1 = km1 + 1;
			km2 = km2 - 1;
		}

		System.out.println("Se encuentran en el " + km1 + " km");

	}

}
