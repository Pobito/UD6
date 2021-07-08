package Tarea06;

import javax.swing.JOptionPane;

public class ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String texto = JOptionPane.showInputDialog("Di el tamaño del array");
		int tamaño = Integer.parseInt(texto), max, min;
		texto = JOptionPane.showInputDialog("Di el máximo");
		max = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el mínimo");
		min = Integer.parseInt(texto);
		int arrayA[] = new int[tamaño];
		int arrayB[] = new int[tamaño];
		
		
		rellenar(arrayA, min, max);
		copiarVector(arrayA, arrayB);
		multiplicacion(arrayA,arrayB);
		
	}

	// Para rellenar el vector con numeros random con max i min
	public static void rellenar (int[] array, int min, int max) {
		int i;
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
	}
	
	// Para rellenar el vector 2 con los mismos numeros pero con las posiciones cambiadas
	public static void copiarVector (int[] arrayA, int[] arrayB) {
		int[] nums = new int[arrayA.length];
		int i = 0, j, random;
		boolean repe;
		
		// Para llenar todo el vector de un numero (basicamente para poder comparar abajo, sino da error al comparar 
		// un num con un null
		for (j = 0; j < nums.length; j++) {
			nums[j] = -1;
		}
		
		while (i < nums.length) {
			repe = false; // Cada paso del bucle tenemos que ponerlo a false
			random = (int) (Math.random() * nums.length);
			
			// Comprovamos que el numero no este dicho
			for (j = 0; j < nums.length && !repe; j++) {
				if (random == nums[j]) {
					repe = true;
				}
			}
			// Si no esta repe... guardamos el numero de la posicio i en el arrayB en la posicion random
			if (!repe) {
				nums[i] = random;
				arrayB[random] = arrayA[i];
				i++;
			}
		}
	}
	
	// Para mostrar arrays
	public static void mostrarArrays (int[] array) {
		int i;
		
		for (i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, array[i]);
		}
	}
	
	// Para calcular la multiplicacion y mostrar arrays
	public static void multiplicacion (int[] arrayA, int[] arrayB) {
		int[] arrayC = new int[arrayA.length];
		int i;
		
		for (i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i] * arrayB[i];
		}
		JOptionPane.showMessageDialog(null, "Array A");
		mostrarArrays(arrayA);
		JOptionPane.showMessageDialog(null, "Array B");
		mostrarArrays(arrayB);
		JOptionPane.showMessageDialog(null, "Array C");
		mostrarArrays(arrayC);
	}
	
}
