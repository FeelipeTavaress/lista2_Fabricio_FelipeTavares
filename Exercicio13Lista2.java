
package exercicio13lista2;

import java.util.Scanner;


public class Exercicio13Lista2 {


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int numerador1;
     int denominador1;
     int numerador2;
     int denominador2;
     int soma;
     int resultado1;
     int resultado2;
     
      System.out.println(" Escreva o numerador da primeira fração: ");
      numerador1 = sc.nextInt();
      System.out.println(" Escreva o denominador da primeira fração: ");
      denominador1 = sc.nextInt();
      System.out.println(" Escreva o numerador da segunda fração: ");
      numerador2 = sc.nextInt();
      System.out.println(" Escreva o numerador da segunda fração: ");
      denominador2 = sc.nextInt();
      
      if (denominador1 == denominador2) { 
            resultado1 = numerador1 + numerador2;
            resultado2 = denominador1;
         }
        
        else {
        resultado1 = ((numerador1 * denominador2) + (denominador1 * numerador1));
        resultado2 = denominador1 * denominador2;
        }
        
        System.out.print("O resultado da soma das frações é " + (int)resultado1 + "/" + (int)resultado2);
        
        sc.close();
    
    }
    
    
}
