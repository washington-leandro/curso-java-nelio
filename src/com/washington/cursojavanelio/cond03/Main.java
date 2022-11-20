package com.washington.cursojavanelio.cond03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		Scanner scan = new Scanner(System.in);
		int numberA, numberB;
		
		System.out.println("Informe o primeiro numero: ");
		numberA = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		numberB = scan.nextInt();
		
		if (numberA % numberB == 0 || numberB % numberA == 0) {
			System.out.println("SÃO MULTIPLOS ENTRE SI");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS ENTRE SI");
		}
		
		scan.close();

	}

}
