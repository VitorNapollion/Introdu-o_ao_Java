package ProgramasExercicios;

import java.util.Scanner;

public class QuantidadePar {
    public static int par(int [] numeros){
        int pares = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] %2 == 0){
                pares++;
    
            } else if(numeros[i] %2 == 0 && numeros[i] < 0){
                pares++;

            }

        }
        return pares;
        
    }
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros você quer testar? ");
        
        int quantN = Integer.parseInt(leitor.nextLine());
        int[] Npares = new int[quantN];
        for(int i =0; i<quantN; i++){
            System.out.println("Digite o numero ["+i+"]: ");
            Npares[i] = Integer.parseInt(leitor.nextLine());
        }
        System.out.println("A quantidade de números pares é "+ par(Npares));

        leitor.close();
    }
    
}
