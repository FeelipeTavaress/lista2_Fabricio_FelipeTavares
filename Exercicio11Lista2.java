
package exercicio11lista2;

import java.util.Scanner;


public class Exercicio11Lista2 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double potencia;
       double horas;
       double valor;
       double valorfinal;
       double KWh;
       System.out.println(" Informe a potência do equipamento em Watts: ");
       potencia = sc.nextDouble();
       System.out.println(" Informe a quantidade de horas que ele fica ligado por dia: ");
       horas = sc.nextDouble();
       System.out.println(" Informe o valor do KW/h: ");
       valor = sc.nextDouble();
       KWh = (potencia * horas)/1000;
       valorfinal = (KWh * valor);
       
        System.out.println(" O consumo em KW/h é: "+ KWh);
        
          System.out.println(" O valor total a ser pago é: "+ valorfinal);
       
       
    }
    
}
