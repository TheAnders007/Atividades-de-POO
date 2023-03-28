package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	int anoAtual;	
	int anoNascimento;	
	int idadeAnos;	
	int idadeMeses;
	int idadeSemanas;
	int idadeDias;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira o ano atual: ");
	anoAtual = sc.nextInt(); 
	System.out.println("Insira o ano em que você nasceu: ");
	anoNascimento = sc.nextInt();
	
	idadeAnos = anoAtual - anoNascimento;
	idadeMeses = (anoAtual - anoNascimento) * 12;
	idadeSemanas = (anoAtual -anoNascimento) * 48;
	idadeDias = (anoAtual - anoNascimento) * 365;
	
	System.out.println("Sua idade em anos é: " + idadeAnos + " anos.");
	System.out.println("Sua idade em meses é: " + idadeMeses + " meses.");
	System.out.println("Sua idade em semanas é: " + idadeSemanas + " semanas.");
	System.out.println("Sua idade em dias é: " + idadeDias + " dias.");
	}

}
