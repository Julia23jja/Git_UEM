package Ejercicio2;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el n�mero de mes (1-12) ");
		int mes = Integer.parseInt(sc.nextLine());

		if (mes < 12 && mes > 1) {
			// 31 DIAS
			if (mes == 1) {
				System.out.println("Enero tiene 31 d�as");
			}
			if (mes == 3) {
				System.out.println("Marzo tiene 31 d�as");
			}
			if (mes == 5) {
				System.out.println("Mayo tiene 31 d�as");
			}
			if (mes == 7) {
				System.out.println("Julio tiene 31 d�as");
			}
			if (mes == 8) {
				System.out.println("Agosto tiene 31 d�as");
			}
			if (mes == 10) {
				System.out.println("Octubre 31 d�as");
			}
			if (mes == 12) {
				System.out.println("Diciembre tiene 31 d�as");
			}

			// 28 � 29 DIAS
			if (mes == 2) {
				System.out.println("Febrero tiene 28 � 29 d�as");
			}

			// 30 DIAS
			if (mes == 4) {
				System.out.println("Abril tiene 30 d�as");
			}
			if (mes == 9) {
				System.out.println("Septiembre tiene 30 d�as");
			}
			if (mes == 11) {
				System.out.println("Noviembre tiene 30 d�as");
			}

		} else {
			System.out.println("Mes no v�lido, ejecute de nuevo el programa");

			System.out.println("Introduzca un mes");
			mes = Integer.parseInt(sc.nextLine());

			// 31 DIAS
			if (mes == 1) {
				System.out.println("Enero tiene 31 d�as");
			}
			if (mes == 3) {
				System.out.println("Marzo tiene 31 d�as");
			}
			if (mes == 5) {
				System.out.println("Mayo tiene 31 d�as");
			}
			if (mes == 7) {
				System.out.println("Julio tiene 31 d�as");
			}
			if (mes == 8) {
				System.out.println("Agosto tiene 31 d�as");
			}
			if (mes == 10) {
				System.out.println("Octubre 31 d�as");
			}
			if (mes == 12) {
				System.out.println("Diciembre tiene 31 d�as");
			}

			// 28 � 29 DIAS
			if (mes == 2) {
				System.out.println("Febrero tiene 28 � 29 d�as");
			}

			// 30 DIAS
			if (mes == 4) {
				System.out.println("Abril tiene 30 d�as");
			}
			if (mes == 9) {
				System.out.println("Septiembre tiene 30 d�as");
			}
			if (mes == 11) {
				System.out.println("Noviembre tiene 30 d�as");
			}

		}

		sc.close();

	}

}
