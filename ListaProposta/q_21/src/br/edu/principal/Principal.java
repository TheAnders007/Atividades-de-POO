package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
	
	float salario, horasMensais, salarioBruto, horasTrabalhadas, salarioMinimo, horasExtras, quantiaHorasExtras, salarioReceber;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	System.out.println("Insira o seu salário: ");
	salario = sc.nextFloat();
	System.out.println("Insira a sua carga horária mensal padrão: ");
	horasMensais = sc.nextFloat();
	System.out.println("Insira quantas horas você trabalhou: ");
	horasTrabalhadas = sc.nextFloat();
	System.out.println("Insira o valor do salário mínimo: ");
	salarioMinimo = sc.nextFloat();
	System.out.println("Insira quantas horas extras você trabalhou: ");
	horasExtras = sc.nextFloat();
	
	horasTrabalhadas = salarioMinimo/8;
	horasExtras = salarioMinimo/4;
	salarioBruto = horasTrabalhadas * (salario/horasMensais);
	quantiaHorasExtras = horasExtras * (salario/horasMensais)/2;
	salarioReceber = salarioBruto + quantiaHorasExtras;
	
	System.out.println("O salário a receber é de: R$" + df.format(salarioReceber));

	}

}
