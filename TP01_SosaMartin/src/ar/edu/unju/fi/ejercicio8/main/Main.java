package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(insertNumber());
		System.out.println("Sumatoria: "+calculadora.calcularSumatoria()+", Productoria: "+calculadora.calcularProductoria());
	}
	
	static int insertNumber() {
		System.out.println("ingrese numero entero");
		return scanner.nextInt();
	}

}
