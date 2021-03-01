package ejercicio8;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		//Variables
		double precio;
		double descuento;
		double preciototal;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el precio total de la compra");
			precio = sc.nextDouble();
			
			descuento = precio * 0.15;
			preciototal = precio - descuento;
			System.out.println("Este es el precio final de la compra " + preciototal + " € ");
		
		sc.close();

	}

}
