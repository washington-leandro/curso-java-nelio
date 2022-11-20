package com.washington.cursojavanelio.valorpeca;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int codigoProduto1, codigoProduto2, qtde1, qtde2;
		double precoUnitario1, precoUnitario2, totalPagar;

		System.out.println("===== CALCULAR O TOTAL A PAGAR =====\n");
		// ler codigo do produto
		System.out.println("Informe o codigo do primeiro produto: ");
		codigoProduto1 = scan.nextInt();
		// ler numero de pe�as
		System.out.println("Informe o numero de pe�as do primeiro produto: ");
		qtde1 = scan.nextInt();
		// valor unitario de cada pe�a
		System.out.println("Informe o pre�o unitario do primeiro produto: ");
		precoUnitario1 = scan.nextDouble();
		// ler codigo de outra pe�a
		System.out.println("Informe o codigo do segundo produto: ");
		codigoProduto2 = scan.nextInt();
		// numero de pe�as do segundo produto
		System.out.println("Informe o numero de pe�as do segundo produto: ");
		qtde2 = scan.nextInt();
		// valor unitario dessa outra pe�a
		System.out.println("Informe o pre�o unitario do segundo produto: ");
		precoUnitario2 = scan.nextDouble();

		// calcular o valor a ser pago
		totalPagar = (qtde1 * precoUnitario1) + (qtde2 * precoUnitario2);

		System.out.printf("Valor a pagar: R$ %.2f%n", totalPagar);

		scan.close();

	}

}
