package AE1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);

	public App() {

	}

	// 1
	public void sayHello() {
		System.out.println("Hola Mundo");

	}

	// 2.a
	public void nombres1() {
		String lista[] = { "Rene", "Pau", "Ripoll", "David", "Joan", "Ximo" };

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	// 2.b
	public void lista2() {

		ArrayList<String> Lista = new ArrayList<>();

		Lista.add("Rene");
		Lista.add("Pau");
		Lista.add("Ripoll");
		Lista.add("David");
		Lista.add("Joan");
		Lista.add("Ximo");

		for (int i = 0; i < Lista.size(); i++) {
			System.out.println(Lista.get(i));
		}
	}

	// 3
	public void sumaPares() {
		System.out.println("★Calculo de numeros pares★");
		System.out.println("Dame un numero par y calculare hasta llegar a el");

		int num = sc.nextInt();
		int par = 0;

		if (num % 2 == 0) {

			for (int i = 0; i < num; i++)
				;
			{

				System.out.printf("%1s %s\n", "", num);
				par += num;
			}

			System.out.println("La suma es:" + par);
		} else {
			System.out.println("No me has dado un numero par");
		}
	}

	// 4
	public void calculoFactorial() {

		long factorial = 1;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + num + " es: " + factorial);

		sc.close();
	}

	// 5
	public void arrayMayor() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime el tamaño del array: ");
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Dime el primer número " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		int mayor;
		mayor = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}

		}
		System.out.println("El numero mas grande es: " + mayor);
		sc.close();
	}

	// 6
	public void sumaInversa() {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {

			System.out.print("Dime el número " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		System.out.println("Numeros introducidos a la inversa " + array[4] + " " + array[3] + " " + array[2] + " "
				+ array[1] + " " + array[0]);
		System.out.println(
				"La suma de los numeros introducidos es " + (array[4] + array[3] + array[2] + array[1] + array[0]));
		sc.close();
	}

	// 7
	public void calculoAños() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nom = sc.next();
		System.out.println("Dime cuantos años llevas programando");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println(nom + " Desarrollador Junior L1 – 15000-18000");
		}
		if (num >= 1 && num < 2) {
			System.out.println(nom + " Desarrollador Junior L2 – 18000-22000");
		}
		if (num >= 3 && num < 5) {
			System.out.println(nom + " Desarrollador Senior L1 – 22000-28000");
		}
		if (num >= 5 && num < 8) {
			System.out.println(nom + " Desarrollador Senior L2 – 28000-36000");
		}
		if (num >= 8) {
			System.out.println(nom + " Analista / Arquitecto. Salario a convenir en base a rol");
		}
		sc.close();
	}

	// 8
	public void intervaloNum() {
		int inicioR;
		int finalR;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el primer numero del rango");
		inicioR = sc.nextInt();
		System.out.println("Dame el ultimo numero del rango");
		finalR = sc.nextInt();

		int x;
		long empieza = System.nanoTime();

		for (x = inicioR; x <= finalR; x++) {
			System.out.println(x);

			int numero = x;

			if (numero % 2 == 0 || numero % 3 == 0) {
				System.out.println("No es primo");

			} else {
				System.out.println("Es primo");
			}
			sc.close();}
		System.out.println("Ha tardado " + (System.nanoTime() - empieza) + " nanosegundos");

	}
}
