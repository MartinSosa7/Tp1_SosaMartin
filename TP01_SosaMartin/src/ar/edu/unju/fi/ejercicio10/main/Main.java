package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidadPizzas = 1;
		while (cantidadPizzas <= 3) {
			Pizza pizza = createPizza();
			System.out.println("**Pizza "+cantidadPizzas+"**"
							+ "\nDiametro: "+pizza.getDiametro()
							+ "\nIngredientes especiales: "+pizza.isIngredientesEspeciales()
							+ "\nPrecio Pizza: "+pizza.getPrice()
							+ "\nArea de la pizza: "+pizza.getArea());
			cantidadPizzas++;
		}
		
	}

	static Pizza createPizza() {
		Pizza pizza = new Pizza();
		pizza.setDiametro(insertDiametro());
		pizza.setIngredientesEspeciales(specialOrNot());
		pizza.calcularArea();
		return pizza;
	}
	
	static Integer insertDiametro() {
		int diametro;
		do {
			System.out.println("INGRESE DIAMETRO, valores de 20, 30 o 40");
			diametro = scanner.nextInt();
		} while (!(diametro == 20 || diametro == 30 || diametro == 40));
		return diametro;
	}
	
	static boolean specialOrNot() {
		String answer;
		do {
			System.out.println("AGREGAR INGREDIENTES ESPECIALES? Respuesta s/n");
			answer = scanner.next();
		} while (!(answer.equals("s") || answer.equals("n")));
		if(answer.equals("s"))
			return true;
		return false;
	}
}
