package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

class Principal {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    float angulo;
    double distan;
    double radian;
    double escada;

    System.out.println("Digite o ângulo em graus formado pela escada apoiada no chão:");
    angulo = sc.nextFloat();
    System.out.println("Digite em metros a distância da base da escada para a parede:");
    distan = sc.nextFloat();
    radian = (angulo * 3.14)/180;
    escada = distan/(Math.cos(radian));
    System.out.println("O valor da medida da escada é " + df.format(escada) + " metros");
    
  } 
}
