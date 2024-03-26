
package exercicio5lista2fabricio;

import java.util.Scanner;


public class Exercicio5Lista2Fabricio {


   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double lado1;
        double lado2;
        double base;
        double perimetro;
        double area;
        double diagonal;
         System.out.println("Informe o valor de um dos lados do retângulo: ");
         lado1 = sc.nextDouble();
         System.out.println("Informe o valor do outro lado do retângulo: ");
         lado2 = sc.nextDouble();
         perimetro =(lado1 + lado2 + lado1 + lado2);
         area = (lado1 * lado2);
         diagonal =(Math.sqrt((lado1 * lado1)+ lado2 * lado2));
         
          System.out.println("O perímetro é: "+ perimetro);
          System.out.println("A área é: "+ area);
          System.out.println("A diagonal é: " + diagonal);
         
         
        
        
        
        sc.close();
    }
    
}
