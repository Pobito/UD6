package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Di el tamaño del array");
		int tamaño = Integer.parseInt(texto);
		int array[] = new int[tamaño];
		
		randoms(array, 0, 9);
		mostrar(array);
	}
	
	// Para generar randoms
	public static void randoms (int array[], int min, int max) {
		int i;
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
	}
	// Para mostrar el vector
	public static void mostrar (int array[]) {
		int i, suma = 0;
		
		for (i = 0; i < array.length; i++) {
			suma += array[i];
			JOptionPane.showMessageDialog(null, "Indice: " + i + " valor: " + array[i]);
		}
		JOptionPane.showMessageDialog(null, "La suma total es = " + suma);
	}
}
