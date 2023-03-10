package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
	
	float n1;
	float n2;
	float n3;
	float mf;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua primeira nota:");
	n1 = sc.nextFloat();
	System.out.println("Digite sua segunda nota:");
	n2 = sc.nextFloat();
	System.out.println("Digite sua terceira nota:");
	n3 = sc.nextFloat();
	
	mf = (n1 + n2 + n3)/3;
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	System.out.println("Sua média aritmética é: " + df.format(mf));
	
	}

}
