package ejercicio1;

import java.util.Scanner;

public class PerimetroArea {

	public static void main(String[] args) {
		double base = 0;
		double altura = 0;
		double perimetro;
		double area;
		
		//Pedir datos al usuario
		Scanner sc = new Scanner (System.in);
		//mostrar mensaje al usuario
		System.out.println("Introduce la base");
		//recogemos el valor
		base = sc.nextDouble();
		System.out.println("Introduce la altura");
		//recogemos el valor
		altura = sc.nextDouble();
		
		//Hacemos el c�lculo
		area = base * altura;
		System.out.println("Esta es el �rea del rect�ngulo " + area);
		perimetro = (2 * base) + (2 * altura);
		System.out.println("Este es el per�metro del rect�ngulo " + perimetro);

		sc.close();
	}

}
