package Ejercicio2;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de mes (1-12) ");
		int mes = Integer.parseInt(sc.nextLine());

		if (mes < 12 && mes > 1) {
			// 31 DIAS
			if (mes == 1) {
				System.out.println("Enero tiene 31 días");
			}
			if (mes == 3) {
				System.out.println("Marzo tiene 31 días");
			}
			if (mes == 5) {
				System.out.println("Mayo tiene 31 días");
			}
			if (mes == 7) {
				System.out.println("Julio tiene 31 días");
			}
			if (mes == 8) {
				System.out.println("Agosto tiene 31 días");
			}
			if (mes == 10) {
				System.out.println("Octubre 31 días");
			}
			if (mes == 12) {
				System.out.println("Diciembre tiene 31 días");
			}

			// 28 ó 29 DIAS
			if (mes == 2) {
				System.out.println("Febrero tiene 28 ó 29 días");
			}

			// 30 DIAS
			if (mes == 4) {
				System.out.println("Abril tiene 30 días");
			}
			if (mes == 9) {
				System.out.println("Septiembre tiene 30 días");
			}
			if (mes == 11) {
				System.out.println("Noviembre tiene 30 días");
			}

		} else {
			System.out.println("Mes no válido, ejecute de nuevo el programa");

			System.out.println("Introduzca un mes");
			mes = Integer.parseInt(sc.nextLine());

			// 31 DIAS
			if (mes == 1) {
				System.out.println("Enero tiene 31 días");
			}
			if (mes == 3) {
				System.out.println("Marzo tiene 31 días");
			}
			if (mes == 5) {
				System.out.println("Mayo tiene 31 días");
			}
			if (mes == 7) {
				System.out.println("Julio tiene 31 días");
			}
			if (mes == 8) {
				System.out.println("Agosto tiene 31 días");
			}
			if (mes == 10) {
				System.out.println("Octubre 31 días");
			}
			if (mes == 12) {
				System.out.println("Diciembre tiene 31 días");
			}

			// 28 ó 29 DIAS
			if (mes == 2) {
				System.out.println("Febrero tiene 28 ó 29 días");
			}

			// 30 DIAS
			if (mes == 4) {
				System.out.println("Abril tiene 30 días");
			}
			if (mes == 9) {
				System.out.println("Septiembre tiene 30 días");
			}
			if (mes == 11) {
				System.out.println("Noviembre tiene 30 días");
			}

		}

		sc.close();

	}

}
