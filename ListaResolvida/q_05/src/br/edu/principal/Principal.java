package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
				
		float sal;
		float perc;
		float aumento;
		float novosal;
			
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o sal�rio do funcion�rio: R$");
		sal = sc.nextFloat();
		System.out.println("Digite o percentual de aumento: ");
		perc = sc.nextFloat();
		aumento = (sal * perc/100);
		System.out.println("O aumento de sal�rio foi de: R$" + aumento);
		novosal = (sal + aumento);
		System.out.println("O novo sal�rio do funcion�rio �: R$" + novosal);
		
	}

}
