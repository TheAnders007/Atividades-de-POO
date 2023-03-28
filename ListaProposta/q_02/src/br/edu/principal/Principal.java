package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		float multi;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextFloat();
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextFloat();
		multi = ((num1 * num2) * num3);
		System.out.println("A multiplicação entre os 3 números é " + multi);
		
	}

}
