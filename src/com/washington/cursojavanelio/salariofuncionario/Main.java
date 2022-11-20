package com.washington.cursojavanelio.salariofuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double valorPorHora, salario;
		int horasTrabalhadas, codigoFuncionario;
		
		System.out.println("===== CALCULO DO SALARIO DO FUNCIONARIO =====\n");
		// ler um numero do funcionario
		System.out.println("Informe o codigo do funcionario: ");
		codigoFuncionario = scan.nextInt();
		// numero de horas trabalhadas
		System.out.println("Informe o numero de horas trabalhadas: ");
		horasTrabalhadas = scan.nextInt();
		// valor que recebe por hora
		System.out.println("Informe o valor por hora trabalhada: ");
		valorPorHora = scan.nextDouble();
		// salario do funcionario
		salario = valorPorHora * horasTrabalhadas;
		// Imprimir o salario do funcionario com duas casas decimais
		System.out.printf("%nCodigo do funcionario: %d%nSalario: U$ %.2f%n", codigoFuncionario, salario);

		scan.close();

	}

}
