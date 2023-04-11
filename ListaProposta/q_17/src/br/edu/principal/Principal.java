package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
    double raio;	
    double pi = 3.14;
    double comprimento;
    double area;
    double volume;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o raio da esfera: ");
    raio = sc.nextDouble();
    
    comprimento = 2 * pi * raio;
    area = pi * Math.pow(raio, 2);
    volume = (4/3) * pi * Math.pow(raio, 3);
    
    System.out.println("O comprimento da esfera é: " + comprimento);
    System.out.println("A área da esfera é: " + area);
    System.out.println("O volume da esfera é: " + volume);
    
	}

}
