package ejer17;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		//SI EL MES ES 1,3,5,7,8,10,12 tiene 31 d�as
		// SI ES FEBRERO (2) tiene 28 � 29 d�as
		// SI ES 4,9,11 tiene 30 d�as
		// OTRO N�M = ERROR
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero de mes (1-12)");
		int mes = Integer.parseInt(sc.nextLine());
		
		//31 DIAS
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
		
		//28 � 29 DIAS
		if (mes == 2) {
			System.out.println("Febrero tiene 28 � 29 d�as");
		}
		
		//30 DIAS
		if (mes == 4) {
			System.out.println("Abril tiene 30 d�as");
		}
		if (mes == 9) {
			System.out.println("Septiembre tiene 30 d�as");
		}
		if (mes == 11) {
			System.out.println("Noviembre tiene 30 d�as");
		}
		
		//MES INCORRECTO
		if (mes < 1) {
			System.out.println("Mes incorrecto");
		}
		if (mes > 12) {
			System.out.println("Mes incorrecto");
		}
		
		sc.close();

	}

}
