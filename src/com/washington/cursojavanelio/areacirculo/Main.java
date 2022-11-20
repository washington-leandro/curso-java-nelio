package com.washington.cursojavanelio.areacirculo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		System.out.println("===== CALCULAR AREA DO CIRCULO =====\n");
		System.out.println("Informe o valor do raio: ");
		raio = scan.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("O valor da area de um circulo com raio %.2f é: %.4f%n", raio, area);
		scan.close();

	}

}
