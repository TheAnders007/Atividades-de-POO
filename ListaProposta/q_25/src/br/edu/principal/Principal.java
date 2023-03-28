package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	int horas;
	int minutos;
	int horaMinutos;
	int minutosTotal;
	int segundos;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a hora: ");
	horas = sc.nextInt();
	System.out.println("Digite os minutos: ");
	minutos = sc.nextInt();
	
	horaMinutos = horas*60;
	minutosTotal = minutos + horaMinutos;
	segundos = minutosTotal*60;
	
	System.out.println("A hora digitada convertida em minutos foi: " + horaMinutos + " minutos.");
	System.out.println("O total de minutos foi: " + minutosTotal + " minutos.");
	System.out.println("O total de minutos em segundos foi: " + segundos + " segundos.");

	}

}
