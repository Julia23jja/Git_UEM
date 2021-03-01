package ejer15;

import java.util.Scanner;

public class Compa�iaTelefonica {
	static final double IMPUESTO_DOM = 0.3;
	static final double IMPUESTO_MAN = 0.15;
	static final double IMPUESTO_TAR = 0.10;

	public static void main(String[] args) {

		double duracion;
		String dia;
		String turno = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la duraci�n de la llamada (min)");
		duracion = Double.parseDouble(sc.nextLine());

		System.out.println("�La llamada se ha realizado en Domingo?");
		dia = sc.nextLine();

		if (dia.equals("No")) {
			System.out.println("Introduce cu�ndo se realiz� la llamada (Ma�ana/Tarde)");
			turno = sc.nextLine();
		}

		double coste = 0;

		// CALCULAR LA DURACI�N
		if (duracion <= 5) {
			coste = duracion * 100;
		} else if (duracion <= 8) {
			coste = ((duracion - 5) * 80) + 500;
		} else if (duracion <= 10) {
			coste = ((duracion - 8) * 70) + 240 + 500;
		} else if (duracion > 10) {
			coste = ((duracion - 10) * 50) + 140 + 240 + 500;
		} else {
			// duracion negativa
		}

		// CALCULAR D�A
		// DOMINGO
		if (dia.equalsIgnoreCase("S�")) {
			coste = coste + (coste * IMPUESTO_DOM);
		} else if (turno.equalsIgnoreCase("Ma�ana")) {
			coste = coste + (coste * IMPUESTO_MAN);
		} else {
			coste = coste + (coste * IMPUESTO_TAR);
		}

		// MOSTRAR RESULTADOS
		System.out.println("El coste de la llamada es: " + coste / 100 + " �");

		sc.close();

	}

}
