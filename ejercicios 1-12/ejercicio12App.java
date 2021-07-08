package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = JOptionPane.showInputDialog("Di el tamaño del array");
		int tamaño = Integer.parseInt(texto), max = 300, min = 1, num;
		int[] array = new int[tamaño];
		texto = JOptionPane.showInputDialog("Di el tamaño del array");
		num = Integer.parseInt(texto);
		
		randoms(array, min, max);
		decirNums(array, num);
	}
	
	// Para generar randoms
	public static void randoms (int[] array, int min, int max) {
		int i;
			
		for (i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
	}
	
	// Para guardar los numeros con la ultima cifra igual a la que me dice el usuario
	public static void decirNums (int[] array, int num) {
		int[] nums = new int[array.length];
		int cont= 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == num) {
				nums[cont] = array[i];
				cont++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) { // Para que no me muestre si hay un 0 :)
				System.out.println(nums[i]);				
			}
		}
	}
}
