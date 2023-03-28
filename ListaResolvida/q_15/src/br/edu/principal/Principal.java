package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	float p_fab;	
	float perc_d;
	float perc_i;
	float vlr_d;
	float vlr_i;
	float p_final;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira o preço de fábrica do veículo: ");
	p_fab = sc.nextFloat();
    System.out.println("Insira o percentual de lucro do distribuidor: ");
    perc_d = sc.nextFloat();
    System.out.println("Insira o percentual de impostos: ");
    perc_i = sc.nextFloat();
    vlr_d = (p_fab * perc_d)/100;
    vlr_i = (p_fab * perc_i)/100;
    p_final = p_fab + vlr_d + vlr_i;
    System.out.println("O valor correspondente ao lucro do distribuidor é de R$" + vlr_d + ".");
    System.out.println("O valor correspondente aos impostos é de R$" + vlr_i + ".");
    System.out.println("O preço final do veículo é de R$" + p_final + ".");
	}

}
