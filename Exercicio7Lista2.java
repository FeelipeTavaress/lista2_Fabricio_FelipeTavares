
package exercicio7lista2;

import java.util.Scanner;

public class Exercicio7Lista2 {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double LarguraArea;
        double ComprimentoArea;
        double LarguraCeramica;
        double ComprimentoCeramica;
        double area1;
        double areaCeramica;
        double porcentagem;
        double total;
        double ValorMetro;
        double ValorFinal;
        
        
        
        System.out.println(" Informe a largura da área a ser revestida: ");
        LarguraArea = sc.nextDouble();
        System.out.println(" Informe o comprimento da área a ser revestida: ");
        ComprimentoArea = sc.nextDouble();
        System.out.println(" Informe a largura da cerâmica escolhida: ");
        LarguraCeramica = sc.nextDouble();
        System.out.println(" Informe o comprimento da cerâmica escolhida: ");
        ComprimentoCeramica = sc.nextDouble();
        System.out.println(" Informe a valor do metro quadrado de cerâmica: ");
        ValorMetro = sc.nextDouble();
        
        area1 = (LarguraArea * ComprimentoArea);
        areaCeramica = (LarguraCeramica * ComprimentoCeramica);
        porcentagem = (area1 / 100)*10 ;
        total =(area1 / areaCeramica)+ porcentagem;
        ValorFinal = (total * areaCeramica)* ValorMetro;
        
        System.out.println("o total de ceramica necessário para cobrir a área é:" + total);
         System.out.println("o Valor total de cerâmica necessário para cobrir a área é:" + "R$ " + ValorFinal);
        
        
    }
    
}
