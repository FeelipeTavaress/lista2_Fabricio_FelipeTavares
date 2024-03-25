
package exercicio4lista2fabricio;

import java.util.Scanner;

public class Exercicio4lista2Fabricio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        double x;
        double y;
        
        System.out.println("Informe o primeiro valor: ");
           num1 = sc.nextDouble();
         System.out.println("Informe o segundo valor: ");
         num2 = sc.nextDouble();
          System.out.println("Informe o valor da outra medida: ");
          num3 = sc.nextDouble();
         
         x = (num1 * num2);
         y = (x / num3);
         
         System.out.println("O valor de X é:"+ y);
         
    }
   
}
