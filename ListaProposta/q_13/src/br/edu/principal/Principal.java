package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
	
	float num;
	float resultado;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número para saber a sua tabuada: ");
	num = sc.nextFloat();
	for( int i = 0; i <= 10; i++){
		resultado = num * i;
		System.out.println(num + " x " + i + " = " + resultado);
		
	    }
	}

}
