package br.com.erickfreire.aritmeticamenormaior;

import java.util.Scanner;

/**
 * Crie um programa em Java que recebe 3 valores e calcula a soma, média, produto e mostre o maior e o menor valor
 * @author Erick Freire
 * @version 1 Criado em 26-03-2021 as 19:27
 */

public class AritmeticaMenorMaior {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double numero3;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextDouble();
		
		System.out.printf("O valor da Soma: %.2f%n", numero1 + numero2 + numero3);
		System.out.printf("O valor da Média: %.2f%n", (numero1 + numero2 + numero3)/3);
		System.out.printf("O valor do Produto: %.2f%n", numero1 * numero2 * numero3);
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				System.out.printf("O maior valor é o primeiro: %.2f%n", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				System.out.printf("O maior valor é o segundo: %.2f%n", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				System.out.printf("O maior valor é o terceiro: %.2f%n", numero3);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				System.out.printf("O menor valor é o primeiro: %.2f%n", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				System.out.printf("O menor valor é o segundo: %.2f%n", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				System.out.printf("O menor valor é o terceiro: %.2f%n", numero3);

	}

}
