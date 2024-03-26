
package exercicio8lista2;

import java.util.Scanner;


public class Exercicio8Lista2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double MB;
        double Mbps;
        double minutos;
        
         System.out.println(" Informe o tamanho do arquivo em MB que se quer baixar: ");
         MB = sc.nextDouble();
         System.out.println(" Informe a velocidade do link em Mbps: ");
         Mbps = sc.nextDouble();
         minutos = (MB / Mbps)/60;
         System.out.println(" O total de minutos para fazer o download é: " + minutos);
         
         
    }
    
}
