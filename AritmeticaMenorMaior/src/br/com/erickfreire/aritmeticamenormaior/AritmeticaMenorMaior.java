package br.com.erickfreire.aritmeticamenormaior;

import java.util.Scanner;

/**
 * Crie um programa em Java que recebe três valores e exibe a soma, média, produto o menor valor e o maior valor
 * @version 1 - Criado em 07-01/2020 as 19:21
 * @author Erick Freire
 *
 */

public class AritmeticaMenorMaior {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa Que calcula a soma, média, produto e verifica o menor e maior valor");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		System.out.printf("%n%nA soma dos valores é de: %d%n", numero1 + numero2 + numero3);
		System.out.printf("A média dos valores é de: %d%n", ((numero1 + numero2 + numero3) / 3));
		System.out.printf("O Produto dos valores é de: %d%n", numero1 * numero2 * numero3);
		
		if(numero1 > numero2)
			if (numero1 > numero3)
				System.out.printf("O maior valor é o: %d%n", numero1);
		if(numero2 > numero1)
			if (numero2 > numero3)
				System.out.printf("O maior valor é o: %d%n", numero2);
		if(numero3 > numero1)
			if (numero3 > numero2)
				System.out.printf("O maior valor é o: %d%n", numero3);
		
		if(numero1 < numero2)
			if (numero1 < numero3)
				System.out.printf("O menor valor é o: %d%n", numero1);
		if(numero2 < numero1)
			if (numero2 < numero3)
				System.out.printf("O menor valor é o: %d%n", numero2);
		if(numero3 < numero1)
			if (numero3 < numero2)
				System.out.printf("O menor valor é o: %d%n", numero3);

	}

}
