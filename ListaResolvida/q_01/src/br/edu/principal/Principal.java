package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int n1, n2, n3, n4, soma;
				
				System.out.println("Digite o primeiro n�mero");
				n1 = sc.nextInt();
				
				System.out.println("Digite o segundo n�mero");
				n2 = sc.nextInt();
				
				System.out.println("Digite o terceiro n�mero");
				n3 = sc.nextInt();
				
				System.out.println("Digite o quarto n�mero");
				n4 = sc.nextInt();
				
				soma = n1 + n2 + n3 + n4;
				System.out.println("A soma entre os 4 n�meros � " + soma + ".");


	}

}
