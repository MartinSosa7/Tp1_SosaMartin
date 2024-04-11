package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numbersArray = new int[getArrayLength()];
		showInfo(getNumbers(numbersArray));

	}

	static int getArrayLength() {
		int length;
		do {
			System.out.println("ingrese el tamaño del array comprendido entre 3 y 10");
			length = scanner.nextInt();
		} while (length >10 || length <3);
		return length;
	}
	
	static int[] getNumbers(int numbersArray[]) {
		for(int i = 0; i < numbersArray.length; i++) {
			System.out.println("ingrese el valor de la posicion "+(i+1));
			numbersArray[i] = scanner.nextInt();
		}
		
		return numbersArray;
	}
	
	static void showInfo(int[] numbersArray) {
		int sumatory = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println("valor de la posicion "+(i+1)+" : "+numbersArray[i]);
		sumatory += numbersArray[i];
		}
		System.out.println("Sumatoria de los valores: "+sumatory);
	}
}
