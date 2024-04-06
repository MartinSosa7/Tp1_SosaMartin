package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	static String name;
	static Integer legajo;
	static Float salary;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		infoUpload();
		incrementSalary();
	}
	
	static void infoUpload() {
		System.out.println("ingrese nombre");
		name = scanner.nextLine();
		System.out.println("ingrese legajo");
		legajo = scanner.nextInt();
		System.out.println("ingrese salario");
		salary = scanner.nextFloat(); //FIXME toma valores enteros y los convierte en floats pero no toma floats como tal
	}
	
	static void incrementSalary() {
		Empleado empleado = new Empleado(name,legajo,salary);
		System.out.println("INFO ACTUAL");
		empleado.showInfo();
		empleado.incrementSalary();
		System.out.println("INFO ACTUALIZADA");
		empleado.showInfo();
	}

}
