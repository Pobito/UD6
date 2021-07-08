package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[10];
		
		rellenar(array);
		mostrar(array);		
	}

	// Rellenar valores
	public static void rellenar (int array[]) {
		int i;
		
		for (i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Di un numero"));
		}
	}
	
	// Para mostrar el vector
	public static void mostrar (int array[]) {
		int i;
		
		for (i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice: " + i + " valor: " + array[i]);
		}
	}
}
