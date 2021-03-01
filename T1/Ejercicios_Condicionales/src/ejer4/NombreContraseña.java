package ejer4;

import java.util.Scanner;

public class NombreContraseña {

	private static final String JULIA = null;
	private static final String ABC = null;

	public static void main(String[] args) {
		//CREDENCIALES CORRECTAS
		String nombreCorrecto = JULIA;
		String contraseñaCorrecto = ABC;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de usuario");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la contraseña");
		String contraseña = sc.nextLine();
		
		if (nombre == nombreCorrecto && contraseña == contraseñaCorrecto){
			System.out.println("Nombre y contraseña correctos. Iniciando el sistema");
			
		} else {
			System.out.println("Nombre y contraseña incorrectos");
		}


		
		sc.close();

	}

}
