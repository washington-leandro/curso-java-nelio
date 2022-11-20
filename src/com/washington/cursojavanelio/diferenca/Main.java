package com.washington.cursojavanelio.diferenca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberOne, numberTwo, numberThree, numberFour, subtraction;
		
		System.out.println("===== CALCULO DA DIFERENÇA DE DOIS PRODUTOS\n");
		System.out.println("Informe o primeiro numero: ");
		numberOne = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		numberTwo = scan.nextInt();
		System.out.println("Informe o terceiro numero: ");
		numberThree = scan.nextInt();
		System.out.println("Informe o quarto numero: ");
		numberFour = scan.nextInt();
		
		subtraction = (numberOne * numberTwo) - (numberThree * numberFour);
		System.out.printf("O resultado da diferença do produto de %d e %d pelo produto de %d e %d é: %d%n",
		numberOne, numberTwo, numberThree, numberFour, subtraction);
		
		scan.close();
	}

}
