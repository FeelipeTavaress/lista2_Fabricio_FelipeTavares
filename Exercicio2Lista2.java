
package exercicio2lista2;

import java.util.Scanner;


public class Exercicio2Lista2 {

    public static void main(String[] args) {
      Double etanol;
      Double gasolina;
      Double porcentagem;     
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe o preço do etanol: ");
    etanol = sc.nextDouble();
    System.out.println("Informe o preço da gasolina: ");
    gasolina = sc.nextDouble();
    porcentagem = ((etanol*100)/gasolina);
     if(porcentagem>70){
    System.out.println("Não Vale a pena abastecer com etanol! Opte pela gasolina " );
    
    }else{
    System.out.println("Vale a pena abastecer com etanol! Opte por etanol " );
    }
    }
}
