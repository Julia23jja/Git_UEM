package ejercicio7;

public class Sueldo {

	public static void main(String[] args) {
		//Variables
		double sueldo = 1200;
		double comisiones;
		double total;
		
		comisiones = 0.1 * 1200;
		total = sueldo + (comisiones * 3);
		System.out.println("Este es el resultado del sueldo base + comisiones = " + total + " € ");
	}

}
