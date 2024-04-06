package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	
	static String dni;
	static String name;
	static LocalDate birthday;
	static String province;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		constructor1();
		constructor2();
		constructor3();
	}

	static void infoUpload(int constructor) {
		System.out.println("ingrese dni");
		dni = scanner.nextLine();
		System.out.println("ingrese nombre");
		name = scanner.nextLine();
		System.out.println("ingrese fecha de Nacimiento con el formato de YY-MM-dd ej: 1998-09-24");
		birthday = LocalDate.parse(scanner.nextLine());
		if(constructor != 3) {
			System.out.println("ingrese provincia");
			province = scanner.nextLine();
		}
		
	}
	
	static void constructor1() {
		System.out.println("CONSTRUCTOR 1");
		infoUpload(1);
		Persona persona = new Persona();
		persona.setBirthday(birthday);
		persona.setDni(dni);
		persona.setName(name);
		persona.setProvince(province);
		persona.showInfo();
	}
	
	static void constructor2() {
		System.out.println("CONSTRUCTOR 2");
		infoUpload(2);
		Persona persona = new Persona(dni,name,birthday,province);
		persona.showInfo();
	}
	
	static void constructor3() {
		System.out.println("CONSTRUCTOR 3");
		infoUpload(3);
		Persona persona = new Persona(dni,name,birthday);
		persona.showInfo();
	}
}
