package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float vlr_sal;
		float qtd_kw;
		float vlr_kw;
		float vlr_reais;
		float desc;
		float vlr_desc;

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite o valor do salário mínimo: R$");
		vlr_sal = sc.nextFloat();
		System.out.print("Digite a quantidade de quilowatts consumida: ");
		qtd_kw = sc.nextFloat();
		vlr_kw = (vlr_sal)/5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = ((vlr_reais * 15)/100);
		vlr_desc = vlr_reais - desc;
		System.out.println("O valor, em reais, de cada quilowatt é de " + df.format(vlr_kw) + " quilowatts");
		System.out.println("O valor, em reais, a ser pago pela residência é de " + df.format(vlr_reais) + " reais");
		System.out.println("O valor, em reais, a ser pago com 15% de desconto é de " + df.format(vlr_desc) + " reais");
	}

}
