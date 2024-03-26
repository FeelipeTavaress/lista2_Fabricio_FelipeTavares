
package exercicio10lista2;

import java.util.Scanner;


public class Exercicio10Lista2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double peso;
        double agua;
        
        System.out.println(" Informe seu peso: ");
        peso = sc.nextDouble();
        
        agua = (peso * 35);
        
         System.out.println(" O total de água que deve-se beber de água é: "+ agua + "ml");
    }
    
}
