package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		oddOrPairNumber(getNumber());
		
	}

	static int getNumber() {
		System.out.println("ingrese numero: ");
		return scanner.nextInt();
	}
	
	static void oddOrPairNumber(int number) {
		if((number % 2) == 0) {
			System.out.println("par, cuyo doble es: "+number*2);
		}
		else {
			System.out.println("impar, cuyo triple doble es: "+number*3);
		}
	}
}
