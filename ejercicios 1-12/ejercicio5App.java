package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Di el numero");
		int num = Integer.parseInt(texto);
		
		JOptionPane.showMessageDialog(null, "El numero en binario es: " + binario(num));
	}
	
	// Para pasar a binario
	public static String binario (int num) {
		String binario = "", bFinal = "";
		int i;

		// Para obtener el binario (lo tendremos al reves, hay que darle la vuelta
		while (num >= 1) {
			binario += num % 2 + "";
			num /= 2;
		}
		
		// Dar la vuelta al string
		for (i = binario.length()-1; i != -1; i--) {
			bFinal += binario.charAt(i);
		}
		return bFinal;
	}
}
