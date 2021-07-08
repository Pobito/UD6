package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Dime un numero");
		int num = Integer.parseInt(texto);
		
		JOptionPane.showMessageDialog(null, "Su factorial es " + factorial(num));
		
	}
	
	// Para calcular el factorial
	public static int factorial (int num) {
		int fact = num, i; // Iniciamos fact al numeor que nos han pedido
		
		// Bucle de num - 1 (porque ya tenemos num guardado
		for (i = num - 1; i != 0; i--) {
			fact *= i; // Multiplicamos fact por i
		}
		
		return fact;
	}
}
