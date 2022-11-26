package com.washington.cursojavanelio.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Melhoria de codigo com construtores (Nelio Alves)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		//Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		// pega os dados name price e quantity e manda para o construtor product
		Product product = new Product(name, price, quantity);

		// System.out.println(product.name + ", " + product.price + ", " +
		// product.quantity);
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = scan.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		scan.close();

	}

}
