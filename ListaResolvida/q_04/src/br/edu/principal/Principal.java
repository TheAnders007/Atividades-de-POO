package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
				
		float sal;
		float novosal;
				
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o salário do funcionário: R$");
		sal = sc.nextFloat();
		novosal = (sal + ((sal*25)/100));
				
		System.out.println("O novo salário do funcionário é: R$" + novosal);
		
	}

}
