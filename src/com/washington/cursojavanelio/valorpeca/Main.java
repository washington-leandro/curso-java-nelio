package com.washington.cursojavanelio.valorpeca;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int codigoProduto1, codigoProduto2, qtde1, qtde2;
		double precoUnitario1, precoUnitario2, totalPagar;

		System.out.println("===== CALCULAR O TOTAL A PAGAR =====\n");
		// ler codigo do produto
		System.out.println("Informe o codigo do primeiro produto: ");
		codigoProduto1 = scan.nextInt();
		// ler numero de peças
		System.out.println("Informe o numero de peças do primeiro produto: ");
		qtde1 = scan.nextInt();
		// valor unitario de cada peça
		System.out.println("Informe o preço unitario do primeiro produto: ");
		precoUnitario1 = scan.nextDouble();
		// ler codigo de outra peça
		System.out.println("Informe o codigo do segundo produto: ");
		codigoProduto2 = scan.nextInt();
		// numero de peças do segundo produto
		System.out.println("Informe o numero de peças do segundo produto: ");
		qtde2 = scan.nextInt();
		// valor unitario dessa outra peça
		System.out.println("Informe o preço unitario do segundo produto: ");
		precoUnitario2 = scan.nextDouble();

		// calcular o valor a ser pago
		totalPagar = (qtde1 * precoUnitario1) + (qtde2 * precoUnitario2);

		System.out.printf("Valor a pagar: R$ %.2f%n", totalPagar);

		scan.close();

	}

}
