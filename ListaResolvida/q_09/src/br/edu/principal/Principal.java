package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
    float base;
    float altura;
    float area;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a base do triângulo: ");
    base = sc.nextFloat();
    System.out.println("Digite a altura do triângulo: ");
    altura = sc.nextFloat();
    
    area = (base * altura)/2;
    System.out.println("A área do triângulo é: " + area);
		
	}

}
