package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Dime un numero");
		int num = Integer.parseInt(texto);
		
		JOptionPane.showMessageDialog(null, "Es primo? " + esPrimo(num));
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
}
