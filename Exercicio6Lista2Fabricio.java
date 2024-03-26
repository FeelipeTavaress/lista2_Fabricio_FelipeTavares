
package exercicio6lista2fabricio;

import java.util.Scanner;


public class Exercicio6Lista2Fabricio {


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
        
        
        System.out.println(" Informe a largura da área a ser revestida: ");
        LarguraArea = sc.nextDouble();
        System.out.println(" Informe o comprimento da área a ser revestida: ");
        ComprimentoArea = sc.nextDouble();
       System.out.println(" Informe a largura da ceramica escolhida: ");
       LarguraCeramica = sc.nextDouble();
        System.out.println(" Informe o comprimento da ceramica escolhida: ");
        ComprimentoCeramica = sc.nextDouble();
        
        area1 = (LarguraArea * ComprimentoArea);
        areaCeramica = (LarguraCeramica * ComprimentoCeramica);
        porcentagem = (area1 / 100)*10 ;
        total =(area1 / areaCeramica)+ porcentagem;
        
        System.out.println("o total de ceramica necessário para cobrir a área é:"+ total);
        
        
        
    }
    
}
