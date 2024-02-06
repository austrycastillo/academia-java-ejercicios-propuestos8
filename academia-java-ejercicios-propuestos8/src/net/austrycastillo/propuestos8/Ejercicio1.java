package net.austrycastillo.propuestos8;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Desarrolle un programa que nos calcule el área del triángulo, cuadrado y
		 * círculo. Pedirá los valores desde el teclado y el tipo de figura a calcular a
		 * través de un menú de opciones. Crear un método para cada figura. Mostrar en
		 * pantalla el área calculada
		 */
		// solicitamos la figura a calcular
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la figura a calcular: ");
		System.out.println("1 - triángulo");
		System.out.println("2 - cuadrado");
		System.out.println("3 - circulo");
		int figura = sc.nextInt();
		// con la estructura elegimos el calculo
		switch (figura) {
		case 1:
			System.out.println("vamos a calcular el área de un triágulo, escribe la base");
			int base = sc.nextInt();
			System.out.println("introduce la altura");
			int altura = sc.nextInt();
			result = calcularAreaTriangulo(base, altura);
			break;
		case 2:
			System.out.println("vamos a calcular el área de un cuadrado, escribe su lado");
			int lado = sc.nextInt();
			result = calcularAreaCuadrado(lado);
			break;
		case 3:
			System.out.println("vamos a calcular el área de un circulo, escribe su radio");
			int radio = sc.nextInt();
			result = calcularAreaCirculo(radio);
			break;
		default:
			System.out.println("No existe esa opción");
		}
		System.out.println("El área calculada es " + result);

	}

//creamos funciones por cada calculo
	// triángulo
	public static double calcularAreaTriangulo(int base, int altura) {
		return base * altura / 2;
	}

	// cuadrado
	public static double calcularAreaCuadrado(int lado) {
		return lado * lado;
	}

	// circulo
	public static double calcularAreaCirculo(int radio) {
		return Math.pow(radio, 2) * Math.PI;
	}
}
