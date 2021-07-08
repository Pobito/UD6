package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Recojo el texto con el toLowerCase para asegurarme que todo esta en minusculas
		String texto = JOptionPane.showInputDialog("Que quieres calcular? (circulo/triangulo/cuadrado)").toLowerCase();
		int base, altura, radio;
		
		switch (texto) {
			case ("circulo"):
				texto = JOptionPane.showInputDialog("Dime el radio");
				radio = Integer.parseInt(texto);
				JOptionPane.showMessageDialog(null, "El area del circulo es " + circulo(radio));
				break;
			case ("triangulo"):
				texto = JOptionPane.showInputDialog("Dime la base");
				base = Integer.parseInt(texto);
				texto = JOptionPane.showInputDialog("Dime la altura");
				altura = Integer.parseInt(texto);
				JOptionPane.showMessageDialog(null, "El area del triangulo es " + triangulo(base, altura));
				break;
			case ("cuadrado"):
				texto = JOptionPane.showInputDialog("Dime el lado");
				base = Integer.parseInt(texto);
				JOptionPane.showMessageDialog(null, "El area del cuadrado es " + cuadrado(base));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Eleccion incorrecta :(");
		}
	}
	
	// Para calcular el area del circulo
	public static double circulo (int radio) {
		double area;
		
		area = Math.PI * Math.pow(radio, 2);
		
		return area;
	}
	
	// Para calcular el area del triangulo
	public static double triangulo (int base, int altura) {
		double area;
		
		area = base * altura;
		
		return area;
	}
	
	// Para calcular el area del cuadrado
	public static double cuadrado (int base) {
		double area;
		
		area = base * base;
		
		return area;
	}
}
