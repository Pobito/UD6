package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Cuantos numeros quieres generar?");
		int num = Integer.parseInt(texto), max, min, i;
		texto = JOptionPane.showInputDialog("Di el máximo");
		max = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el mínimo");
		min = Integer.parseInt(texto);
		
		// Bucle para generar X numeros random
		for (i = 0; i < num; i++) {
			JOptionPane.showMessageDialog(null,"Numero " + (i+1) + " = " + aleatorio(max, min));
		}
		
		
	}
	
	// Para generar un numero aleatorio entre un max y un min
	public static int aleatorio (int max, int min) {
		return (int) (Math.random() * (max - min - 1) + (min)) + 1; // La suma y resta de los 1 es para poder mostrar los extremos
	}

}
