package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] namesArray = new String[getArrayLength()];
		showInfo(getNames(namesArray));

	}
	static int getArrayLength() {
		int length;
		do {
			System.out.println("ingrese el tamaño del array comprendido entre 5 y 10");
			length = scanner.nextInt();
		} while (length >10 || length <5);
		return length;
	}
	
	static String[] getNames(String[] namesArray) {
		for(int i = 0; i < namesArray.length; i++) {
			System.out.println("ingrese el valor de la posicion "+(i+1));
			namesArray[i] = scanner.next();
		}
		
		return namesArray;
	}
	
	static void showInfo(String[] namesArray) {
		System.out.println("array desde el indice 0");
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println("nombre: "+namesArray[i]);
		}
		System.out.println("array desde el indice correspondiente al largo del array");
		for (int i = namesArray.length-1; i >= 0; i--) {
			System.out.println("nombre: "+namesArray[i]);
		}
	}

}
