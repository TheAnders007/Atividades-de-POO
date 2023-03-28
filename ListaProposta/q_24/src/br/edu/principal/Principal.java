package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
	
	float real,dolar,marco, libra;

	Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

	System.out.print("Digite o valor em reais que você tem para realizar a sua viagem: R$");
	real = sc.nextFloat();

	dolar = real * 1.8f;
	marco = real * 2;
	libra = real * 1.57f;

	System.out.println("Convertendo para dólar, fica " + df.format(dolar) + " dólares ; para marco alemão, fica " + df.format(marco) + " marcos alemães; e para libra esterlina, fica " + df.format(libra) + " libras esterlinas.");

	}

}
