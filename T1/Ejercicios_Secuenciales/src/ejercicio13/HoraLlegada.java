package ejercicio13;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HoraLlegada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora de salida: ");
		long horas = sc.nextLong();
		
		long minutos = TimeUnit.HOURS.toMinutes(horas);
		long segundos = TimeUnit.HOURS.toSeconds(horas);
		
		System.out.println("Esta es la hora con minutos y segundos " + horas +" hh " + minutos + " mm " + segundos + " ss");
		
		System.out.println("Introduce el tiempo (ss) que has tardado en llegar: ");
		long hLlegada = sc.nextLong();
		
		long llegada = segundos + hLlegada;
		
		llegada = TimeUnit.SECONDS.toHours(llegada);
		
		System.out.println("Esta es la hora de llegada: " + llegada +" hh " + minutos +" mm " + segundos + " ss");
		
		sc.close();

	}

}
