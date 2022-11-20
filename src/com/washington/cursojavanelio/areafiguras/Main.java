package com.washington.cursojavanelio.areafiguras;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double valorA, valorB, valorC, areaTringulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo,
				pi = 3.14159;

		System.out.println("===== CALCULO DE AREAS =====\n");
		System.out.println("Digite o valor de A: ");
		valorA = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		valorB = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		valorC = scan.nextDouble();

		areaTringulo = (valorA * valorC) / 2.0;
		areaCirculo = pi * valorC * valorC;
		areaTrapezio = ((valorA + valorB) * valorC) / 2.0;
		areaQuadrado = valorB * valorB;
		areaRetangulo = valorA * valorB;

		System.out.printf("%nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTringulo,
				areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

		scan.close();

	}

}
