package ProgramasExercicios;

import java.util.Scanner;

public class Pposto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Para quantos postos será a pesquisa? ");
        int quant = Integer.parseInt(leitor.nextLine());
        for(int c = 0; c < quant; c++){
            System.out.println("Qual o nome do Posto");
           // String nome = leitor.nextLine();
            System.out.println("Quantos litros irá querer abastecer?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do Litro de gasolina? ");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do Litro de Etanol? ");
            double precoEtanol = Double.parseDouble(leitor.nextLine());
            if(precoEtanol < 0.70 * precoGasolina) {
                System.out.println("Melhor abastecer com etanol.");
                System.out.println("Total a pagar:"+(qtdeLitros*precoEtanol));
            } else{
                System.out.println("Melhor Abastecer com Gasolina");
                System.out.println("Total a pagar:"+(qtdeLitros*precoGasolina));
            }
    


        }
        System.out.println("Fim do programa");
        leitor.close();


    }
    
}
