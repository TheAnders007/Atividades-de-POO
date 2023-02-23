package br.edu.principal;

import java.util.Scanner; 

public class Mediafour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite um valor");
		n1 = input.nextFloat();
		
		System.out.println("Digite um valor");
		n2 = input.nextFloat();
		
		System.out.println("Digite um valor");
		n3 = input.nextFloat();
		
		System.out.println("Digite um valor");
		n4 = input.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.println(media);
		
		input.close();


	}

}
