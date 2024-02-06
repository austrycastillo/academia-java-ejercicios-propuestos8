package net.austrycastillo.propuestos8;

import java.util.Scanner;

public class Ejercicio2 {
	// función que devuelve una canción
	public static String sonarCancion(int opcion) {
		String cancion = "";
		if (opcion == 1)
			cancion = "Vamos a cantar, vamos a bailar,\r\n" + "\r\n" + "porque ya se viene marchadito el carnaval.";
		else if (opcion == 2)
			cancion = "No quisiera quererte, pero te quiero.\r\n" + "\r\n" + "Este castigo tiene la vida mía.";
		else if (opcion == 3)
			cancion = "Que alguien saque a bailar a la morocha\r\n" + "Que se muere de ganas";
		else
			cancion = "sin letra ;(";
		return cancion;
	}
	public static void main(String[] args) {
		/*
		 * Preparar un minisistema tipo rocola, que dependiendo la opción que elija
		 * muestre la letra de una canción
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona la musica que quiere escuchar");
		System.out.println("1 - El borrachito");
		System.out.println("2 - No quisiera quererte");
		System.out.println("3 - La morocha");
		int opcion = sc.nextInt();
		System.out.println(sonarCancion(opcion));

	}

}
