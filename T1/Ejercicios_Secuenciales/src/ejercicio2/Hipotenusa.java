package ejercicio2;

import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		//Declarar variables
		double catetoA = 0;
		double catetoB = 0;
		double hipotenusa;
		
		//Pedir datos al usuario
		Scanner sc = new Scanner(System.in);
		//mostramos por pantalla
		System.out.println("Introduce el cateto A");
		//recogemos el valor
		catetoA = sc.nextDouble();
		//mostramos por pantalla
		System.out.println("Introduce el cateto B");
		//recogemos el valor
		catetoB = sc.nextDouble();
		
		//Calculamos la hipotenusa
		hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
		//Mostramos resultado
		System.out.println("Esta es la hipotenusa " + hipotenusa);
		
		sc.close();

	}

}
