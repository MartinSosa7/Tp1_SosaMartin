package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("factorial: "+factorial(getNumber()));

	}

	static int getNumber() {
		int number;
		do {
			System.out.println("ingrese numero dentro del rango [0,10] ");
			number = scanner.nextInt();
		} while (number>10 || number<0);
		return number;
	}
	
	static int factorial(int number) {
	int result = 1;
		while(number > 0) {
			result = number * result;
			number--;
		}
	return result;
	}
	
	
}
