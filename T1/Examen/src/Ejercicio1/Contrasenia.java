package Ejercicio1;

import java.util.Scanner;

public class Contrasenia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el usuario");
		String user = sc.nextLine();

		System.out.println("Introduce la contrase�a");
		String pass = sc.nextLine();

		// USUARIO = Administrador
		// CONTRASE�A CORRECTA = aaaAAA111

		if (user.equals("Administrador") && pass.equals("aaaAAA111")) {
			System.out.println("�Correcto! Entrando al sistema...");
		} else {
			// REPETIR PROCESO
			while (!user.equals("Administrador") && !pass.equals("aaaAAA111")) {

				System.out.println("Usuario o contrase�a incorrecta, int�ntelo de nuevo\n");

				System.out.println("Introduce el usuario");
				user = sc.nextLine();

				System.out.println("Introduce la contrase�a");
				pass = sc.nextLine();

			}

			System.out.println("�Correcto! Entrando al sistema...");

		}

		sc.close();

	}
}
