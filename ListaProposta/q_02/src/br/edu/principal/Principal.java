package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		float multi;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		num2 = sc.nextFloat();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = sc.nextFloat();
		multi = ((num1 * num2) * num3);
		System.out.println("A multiplica��o entre os 3 n�meros � " + multi);
		
	}

}
