package br.com.icts.util;

public class Utilit {
	
	public static double pow (double i , double j ) {
		double result = 1;
		i = i +1;
		j = j+1;
		for (int j2 = 0; j2 < j; j2++) {
			result *= i;
		}
		return result;
		
	}

	public static void preencher(double mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = Utilit.pow(i, j);
			}
		}
	}

	public static void printMat(double mat[][]) {
		System.out.println("                          Tabuada\n");
		System.out.println("      01    02    03    04    05    06    07    08    09    10\n");
		for (int i = 0; i < mat.length; i++) { // linha
			String line = (i + 1) + "  ";
			for (int j = 0; j < mat.length; j++) { // coluna
				line += " [" + (mat[i][j]) + "]" + " ";
			}
			System.out.println(line);
		}
	}
}
