
package exercicio9lista2;

import java.util.Scanner;


public class Exercicio9Lista2 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double altura = 0;
       double peso = 0;
       double IMC = 0;
       String sexo = null;
       double PesoAjustado = 0;
       
        System.out.println(" Informe a altura(em centímetros): ");
        altura = sc.nextDouble();
        System.out.println(" Informe o peso: ");
        peso = sc.nextDouble();
         System.out.println(" Informe seu sexo: ");
        sexo = sc.nextLine();
                    
         IMC = (52 + (0.75 * (altura - 152.4))); 
         PesoAjustado = ((peso - IMC) * 0.25) + IMC;
         System.out.println(" Seu peso ideal é: "+ IMC);
         System.out.println("Seu peso ideal ajustado é: " + PesoAjustado);
         
        if (sexo == "feminino"){
            
               IMC = (52 + (0.67 * (altura - 152.4)));
                PesoAjustado = ((peso - IMC) * 0.25) + IMC;
         System.out.println(" Seu peso ideal é: "+ IMC);
         System.out.println("Seu peso ideal ajustado é: " + PesoAjustado);
           
           sc.close();
        }
    }
}
    

