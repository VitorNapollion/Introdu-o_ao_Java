package ProgramasExercicios;

import java.util.Scanner;

public class ProgramaConta {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(leitor.nextLine());
        int soma = 0;

         for(int cont = 1; cont<= n; cont++ ){
            soma += cont;
         }

    
        System.out.println("A soma de 1 até "+ n +" é: "+soma);
        leitor.close();


    }
    
}
