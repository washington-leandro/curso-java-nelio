package com.washington.cursojavanelio.cond02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira um numero: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O numero %d é PAR", numero);
		} else {
			System.out.printf("O numero %d é IMPAR", numero);
		}
		
		scan.close();

	}

}
