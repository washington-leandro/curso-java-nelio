package com.washington.cursojavanelio.cond01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um numero para verificar se é positivo ou negativo: ");
		numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.printf("O numero %d é NEGATIVO", numero);
		} else {
			System.out.printf("O numero %d é NAO NEGATIVO", numero);
		}
		
		scan.close();

	}

}
