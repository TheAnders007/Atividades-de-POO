package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
				
		float n1;
		float n2;
		float n3;
		int p1;
		int p2;
		int p3;
		float mf;
				
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite sua primeira nota:");
		n1 = sc.nextFloat();
		System.out.println("Digite o peso da primeira nota:");
		p1 = sc.nextInt();
		System.out.println("Digite sua segunda nota:");
		n2 = sc.nextFloat();
		System.out.println("Digite o peso da segunda nota:");
		p2 = sc.nextInt();
		System.out.println("Digite sua terceira nota:");
		n3 = sc.nextFloat();
		System.out.println("Digite o peso da terceira nota:");
		p3 = sc.nextInt();
				
		mf = (n1 * p1 + n2 * p2 + n3 * p3)/(p1 + p2 + p3);
				
		DecimalFormat df = new DecimalFormat("#.00");
				
		System.out.println("Sua média ponderada é: " + df.format(mf));
		

	}

}