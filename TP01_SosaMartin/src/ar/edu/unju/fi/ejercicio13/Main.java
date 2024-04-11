package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numbersArray = new int[8];
		showArrayValues(getNumbers(numbersArray));

	}
	
	static int[] getNumbers(int numbersArray[]) {
		for(int i = 0; i < 8; i++) {
			System.out.println("ingrese el valor del numero "+(i+1));
			numbersArray[i] = scanner.nextInt();
		}
		
		return numbersArray;
	}

	static void showArrayValues(int[] numbersArray) {
		for (int i : numbersArray) {
			System.out.println("valor: "+i);
		}
		
		
	}
}
