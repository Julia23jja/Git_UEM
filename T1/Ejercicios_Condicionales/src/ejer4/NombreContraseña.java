package ejer4;

import java.util.Scanner;

public class NombreContrase�a {

	private static final String JULIA = null;
	private static final String ABC = null;

	public static void main(String[] args) {
		//CREDENCIALES CORRECTAS
		String nombreCorrecto = JULIA;
		String contrase�aCorrecto = ABC;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de usuario");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la contrase�a");
		String contrase�a = sc.nextLine();
		
		if (nombre == nombreCorrecto && contrase�a == contrase�aCorrecto){
			System.out.println("Nombre y contrase�a correctos. Iniciando el sistema");
			
		} else {
			System.out.println("Nombre y contrase�a incorrectos");
		}


		
		sc.close();

	}

}
