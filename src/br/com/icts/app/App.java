package br.com.icts.app;

import java.awt.FontFormatException;

import br.com.icts.util.Utilit;

public class App {
	public static void main(String[] args) {
		double[][] mat = new double[10][10];
		Utilit.preencher(mat);
		Utilit.printMat(mat);
	}

}
