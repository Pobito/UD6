package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Di el tamaño del array");
		int tamaño = Integer.parseInt(texto), max, min;
		int array[] = new int[tamaño];
		texto = JOptionPane.showInputDialog("Di el máximo");
		max = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el mínimo");
		min = Integer.parseInt(texto);
		
		randoms(array, min, max);
		JOptionPane.showMessageDialog(null, "El numero mas grande es " + maximo(array));
	}

		// Para generar randoms
		public static void randoms (int array[], int min, int max) {
			int i = 0, random;
			
			while (i < array.length) {
				random = (int) (Math.random() * (max - min - 1) + (min)) + 1;
				if (esPrimo(random)) {
					array[i] = random;
					i++;
				}
				
			}
		}
	// Para comprovar que sea primo o no
	public static boolean esPrimo (int num) {
		boolean primo = true;
		int i;
		
		// Bucle hasta la mitad - 1 de num (si no se ha podido dividir entre 2 los demas numeros despues de su mitad tampoco se podra
		for (i = 2; i < (num / 2) && primo; i++) {
			if (num % i == 0) {
				primo = false;
			}
		}
		
		return primo;
	}
	
	// Para mostrar el numero mas grande
	public static int maximo (int[] array) {
		int max = array[0], i;
		
		for (i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
}
