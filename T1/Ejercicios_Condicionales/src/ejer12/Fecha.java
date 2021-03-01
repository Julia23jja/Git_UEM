package ejer12;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        
        String hoy = "03/11/2020";
        
        if (fecha.equals(hoy)) {
        	System.out.println("Fecha correcta");
        } else {
        	System.out.println("Fecha incorrecta");
        }
        
        sc.close();
	}

}
