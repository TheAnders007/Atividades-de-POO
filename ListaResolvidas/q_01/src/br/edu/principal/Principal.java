package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int n1, n2, n3, n4, soma;
				
				System.out.println("Digite o primeiro número");
				n1 = sc.nextInt();
				
				System.out.println("Digite o segundo número");
				n2 = sc.nextInt();
				
				System.out.println("Digite o terceiro número");
				n3 = sc.nextInt();
				
				System.out.println("Digite o quarto número");
				n4 = sc.nextInt();
				
				soma = n1 + n2 + n3 + n4;
				System.out.println("A soma entre os 4 números é " + soma + ".");


	}

}
