package banca;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona jose = new Persona("Jose", "De La Torre", "12345678S", 1200, null);
		Persona chiquito = new Persona("Chiquito", "De la Calzada", "12344678F", 100000, null);

		CuentaBancaria c1 = new CuentaBancaria(123456789, 12.00, jose);
		CuentaBancaria c2 = new CuentaBancaria(232134, 250.00, chiquito);
		jose.setCuenta(c1);
		chiquito.setCuenta(c2);

	}

	public static int mostrarMenuCajero() {
		Scanner s = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("1. Añadir Persona\n2. Elegir persona\n3. Borrar persona\n4. Salir.");
//					Cobrar sueldo
//					Sacar pasta
//					Subir sueldo
//					Mostrar detalles de la persona
			opc = Integer.parseInt(s.nextLine());
		} while (opc < 1 || opc > 5);
		return opc;
	}

	public static void logicaMenu(int opcion) {
		Scanner s = new Scanner(System.in);
		int cantidad = 0;
		switch (opcion) {
		case 1:
			System.out.println("Introduce los datos.");
			ArrayList personas = new ArrayList();
			break;
		case 2:
			int persona = 0;
			System.out.println("1. Cobrar sueldo\n2.Sacar pasta\n3.Subir sueldo.\n4.Mostrar detalles de la persona.");
			persona = Integer.parseInt(s.nextLine());
//			switch (persona) {
//			case 1:
//				Persona.subirSueldo();
//				break;
//			case 2:
//				Persona.sacarPasta();
//				break;
//			case 3:
//				Persona.subirSueldo();
//				break;
//			case 4:
//				Persona.String(toString);
//				break;
//			}

			break;
		case 3:
			int borrar = 0;
			System.out.println("Elige la persona que borrar.");

			break;
		case 4:

			break;
		}
	}
}