
package exercicio3lista3;

import java.util.Scanner;


public class Exercicio3Lista3 {

   
    public static void main(String[] args) {
        int A;
        int B;
        Double C;     
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor de A: ");
    A = sc.nextInt();
    System.out.println("Informe o valor de B: ");
    B = sc.nextInt();
    C =(Math.sqrt(Math.pow(A,2)+ Math.pow(B,2)));
    System.out.println("O valor de C é: " + C);
    }
    
}
