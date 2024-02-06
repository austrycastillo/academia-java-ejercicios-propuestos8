package net.austrycastillo.propuestos8;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crear un algoritmo que simule al cajero del supermercado, se debe ingresar el
		 * o los productos a comprar: cantidad y precios. Calcular el subtotal a pagar y
		 * si es posible aplicar descuentos si supera cierto monto
		 */
		String prod, opc;
		int cant;
		double precio, subtotal = 0, total = 0;
		boolean seguir = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("precio del producto");
			precio = sc.nextDouble();
			System.out.println("cantidad a comprar");
			cant = sc.nextInt();
			subtotal += calcular(cant, precio);
			System.out.println("desea seguir comprando? s/n");
			opc = sc.next();
			if (opc.equalsIgnoreCase("n")) {
				System.out.println("vamos a calcular el total");
				total = calcularTotal(subtotal);
				seguir = false;
			}
			else if (opc.equalsIgnoreCase("s"))
				seguir = true;
			else {
				System.out.println("opción inexistente");
				seguir = false;
			}

		} while (seguir);
		System.out.println("El total a pagar es " + total);
	}

	// función calcular montos
	public static double calcular(int cantidad, double precio) {
		return cantidad * precio;
	}

	// función total
	public static double calcularTotal(double subtotal) {
		double total = 0;
		if (subtotal > 1000)
			total = subtotal * 1.20;
		else
			total = subtotal * 1.05;
		return total;
	}
}
