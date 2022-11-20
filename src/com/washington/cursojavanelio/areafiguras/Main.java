package com.washington.cursojavanelio.areafiguras;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
		 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
		 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
		 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A
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
