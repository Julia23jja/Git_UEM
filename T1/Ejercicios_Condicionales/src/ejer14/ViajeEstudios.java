package ejer14;

import java.util.Scanner;

public class ViajeEstudios {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el número de alumnos");
	double cantAlum = Double.parseDouble(sc.nextLine());
	
	double pagoAlum;
	double servicio = 0;
	
	if (cantAlum >= 100) {
		pagoAlum = 65;
		servicio = pagoAlum * cantAlum;
		System.out.println("El costo por alumnos es de "+ pagoAlum + " - El costo del servicio será: " + servicio + " €");
	} else if (cantAlum >= 50 && cantAlum <99) {
		pagoAlum = 70;
		servicio = pagoAlum * cantAlum;
		System.out.println("El costo por alumnos es de "+ pagoAlum + " - El costo del servicio será: " + servicio + " €");
	} else if (cantAlum >= 30 && cantAlum <49) {
		pagoAlum = 95;
		servicio = pagoAlum * cantAlum;
		System.out.println("El costo por alumnos es de "+ pagoAlum + " - El costo del servicio será: " + servicio + " €");
	} else if (cantAlum < 30) {
		pagoAlum = 4000;
		servicio = pagoAlum * 1;
		System.out.println("Como hay menos de 30 alumnos, el precio está cerrado en: " + servicio + " €");
	}

	sc.close();

	}

}
