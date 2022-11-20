package com.washington.cursojavanelio.cond03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		Scanner scan = new Scanner(System.in);
		int numberA, numberB;
		
		System.out.println("Informe o primeiro numero: ");
		numberA = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		numberB = scan.nextInt();
		
		if (numberA % numberB == 0 || numberB % numberA == 0) {
			System.out.println("S�O MULTIPLOS ENTRE SI");
		} else {
			System.out.println("N�O S�O MULTIPLOS ENTRE SI");
		}
		
		scan.close();

	}

}
