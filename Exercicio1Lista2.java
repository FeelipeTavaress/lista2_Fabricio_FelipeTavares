
package exercicio1lista2;

import java.util.Scanner;


public class Exercicio1Lista2 {

    public static void main(String[] args) {
        int horas;
      double minutos;
     double MinutosTotais;
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe quantas horas são: ");
    horas = sc.nextInt();
    System.out.println("Informe quantos minutos são: ");
     minutos = sc.nextDouble();
    MinutosTotais = ((horas * 60)+ minutos);
    System.out.println("o valor total em mínutos é: " + MinutosTotais);
      
    }
    
}
