package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float pre�o;
		float novo_pre�o;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Digite o pre�o do produto: R$");
		pre�o = sc.nextFloat();
		novo_pre�o = (float)(pre�o * 0.9);
		System.out.print("O novo pre�o do produto � R$" + df.format(novo_pre�o));
		
	}
	
}
