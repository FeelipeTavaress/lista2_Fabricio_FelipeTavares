
package exercicio14lista2;

import java.util.Scanner;


public class Exercicio14Lista2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double X1;
        double X2;
        double Y1;
        double Y2;
        double distancia;
        double resultado1;
        double resultado2;
        
        System.out.println(" Escreva o X do primeiro ponto no plano cartesiano: ");
        X1 = sc.nextDouble();
        System.out.println(" Escreva o Y do primeiro ponto no plano cartesiano: ");
        Y1 = sc.nextDouble();
        System.out.println(" Escreva o X do segundo ponto no plano cartesiano: ");
        X2 = sc.nextDouble();
        System.out.println(" Escreva o Y do segundo ponto no plano cartesiano: ");
        Y2 = sc.nextDouble();
        
        resultado1 = (Math.pow((X1 - X2), 2));
        resultado2 = (Math.pow((Y1 - Y2), 2));
        
        distancia = Math.sqrt(resultado1 + resultado2);
        
         System.out.print("A distância entre o ponto 1 e o ponto 2 é: " + distancia);
    }
    
}
