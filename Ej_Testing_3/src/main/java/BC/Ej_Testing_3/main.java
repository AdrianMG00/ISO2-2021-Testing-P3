package BC.Ej_Testing_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
	final static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int resultado = run();
		System.out.println("El resultado de calidad es "+resultado);
	}
	public static int leerTeclado() {
		int eleccion;
		try {
			System.out.println("Introduzca el parametro del 0 al 100");
			eleccion = teclado.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println();
			eleccion = leerTeclado();
		}
		return eleccion;
	}
	public static int run() {
		int[] params = new int[8];
		ejercicio3 ej = new ejercicio3();
		int eleccion = 0;
		for (int i = 0; i<params.length; i++) {
			eleccion = leerTeclado();
			if (eleccion<0 || eleccion>100) {
				System.out.println("Introduzca el parametro del 0 al 100");
				eleccion = leerTeclado();
			}
		}
		int fun = ej.certificado_calidad_funcional(params[0], params[1], params[2]);
		int man = ej.certificado_calidad_M(params[3], params[4], params[5], params[6], params[7]);
		int calidad = ej.calidad(man, fun);
		return calidad;
	}
	
}
