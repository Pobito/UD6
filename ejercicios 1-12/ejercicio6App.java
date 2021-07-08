package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Dime un numero");
		int num = Integer.parseInt(texto);
		
		JOptionPane.showMessageDialog(null, "El numero tiene " + zifras(num) + " zifras");
	
	}

	// Contar cuantas zifras tiene
	public static int zifras (int num) {
		int zifras = 0;
		
		while (num > 10) {
			num /= 10;
			zifras++;
		}
		
		return ++zifras; // ++zifras para que cuente una mas, la que no cuento cuando es > que 10
	}
}
