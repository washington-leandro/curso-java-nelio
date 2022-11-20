package com.washington.cursojavanelio.soma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int primeiroNumero, segundoNumero, soma;
		
		System.out.println("===== CALCULAR A SOMA DE DOIS NUMEROS =====\n");
		System.out.println("Informe o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		segundoNumero = scan.nextInt();
		soma = primeiroNumero + segundoNumero;
		
		System.out.printf("A soma de %d + %d é: %d%n", primeiroNumero, segundoNumero, soma);
		
		scan.close();

	}

}
