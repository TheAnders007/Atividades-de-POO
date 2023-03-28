package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float preço;
		float novo_preço;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Digite o preço do produto: R$");
		preço = sc.nextFloat();
		novo_preço = (float)(preço * 0.9);
		System.out.print("O novo preço do produto é R$" + df.format(novo_preço));
		
	}
	
}
