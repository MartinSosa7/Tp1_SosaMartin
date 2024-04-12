package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] namesArray = new String[5];
		namesArray = getNames(namesArray);
		showInfo(namesArray);
		removeName(namesArray);

	}
	
	static String[] getNames(String[] namesArray) {
		for(int i = 0; i < namesArray.length; i++) {
			System.out.println("ingrese el nombre numero "+(i+1));
			namesArray[i] = scanner.next();
		}
		
		return namesArray;
	}
	
	
	static void showInfo(String[] namesArray) {
		int index = namesArray.length - 1;
		while (index>=0) {
			System.out.println("nombre: "+namesArray[index]);
			index--;
		}
		System.out.println("Tamaño del arreglo: "+namesArray.length+"\n");
	}
	
	static void removeName(String[] namesArray) {
		System.out.println("valores actuales");
		seeWhatsInside(namesArray);
		for (int i = getIndex(); i < namesArray.length; i++) {
			if(i == namesArray.length-1) {
				namesArray[i] =" ";
				break;
			}
			namesArray[i] = namesArray[i+1];
		}
		System.out.println("valores actulizados");
		seeWhatsInside(namesArray);
	}
	
	
	static int getIndex() {
		int index;
		do {
			System.out.println("ingrese indice del nombre a eliminar [0,4]");
			index = scanner.nextInt();
			
		} while (index < 0 || index > 4);
		return index;
	}
	
	
	static void seeWhatsInside(String[] namesArray) {
		String visualization = "";
		for (int i = 0; i < namesArray.length; i++) {
			visualization+="["+namesArray[i]+"]";
		}
		System.out.println(visualization);
	}

}
