package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		mutiplicationTable(getNumber());
	}

	static int getNumber() {
		int number;
		do {
			System.out.println("ingrese numero dentro del rango [0,9] ");
			number = scanner.nextInt();
		} while (number>9 || number<0);
		return number;
	}
	
	static void mutiplicationTable(int number) {
		for(int i=0;i<=10;i++) {
			System.out.println(number +" * "+i+" ="+(number*i));
		}
	}
}
