package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	static String name;
	static String code;
	static Float price;
	static Integer discount;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		createProduct();
	}
	
	static void infoUpload() {
		System.out.println("ingresar nombre");
		name = scanner.nextLine();
		System.out.println("ingresar codigo");
		code = scanner.nextLine();
		System.out.println("ingresar precio");
		price = scanner.nextFloat();
		do {
			System.out.println("ingresar descuento entre [0,50]");
			discount = scanner.nextInt();
		} while (discount>50 || discount<0);
		scanner.nextLine();
	}
	
	static void createProduct() {
		for(int i = 1;i<=3;i++) {
			Producto producto = new Producto();
			infoUpload();
			producto.setCode(code);
			producto.setDiscount(discount);
			producto.setName(name);
			producto.setPrice(price);
			System.out.println("PRODUCTO Nº"+i);
			System.out.println("codigo: "+producto.getCode()+", nombre: "+producto.getName());
			System.out.println("precio: "+producto.getPrice()+", descuento: "+producto.getDiscount()+", total: "+producto.calcularDescuento());
		}
	}

}
