package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String moneda = JOptionPane.showInputDialog("Que moneda quieres pasar? (dolares/yenes/libras)").toLowerCase();
		String texto = JOptionPane.showInputDialog("Cuantos euros?");
		int num = Integer.parseInt(texto);
		
		cambioMonedas(num, moneda);
		
	}

	// Para canviar monedas
	public static void cambioMonedas (int num, String moneda) {
		double total = 0;
		final double DOLAR = 1.28611, YEN = 129.852, LIBRA = 0.86;
		
		switch (moneda) {
			case ("dolares"):
				total = num * DOLAR;
				break;
			case ("yenes"):
				total = num * YEN;
				break;
			case ("libras"):
				total = num * LIBRA;
				break;
			default: // Por si es una moneda erronea
				JOptionPane.showMessageDialog(null, "Moneda erronea!");
		}
		
		if (total != 0) { // Por si me introducen una moneda erronea que no se muestre esto
			JOptionPane.showMessageDialog(null, "Total " + total);
		}
	}
}
