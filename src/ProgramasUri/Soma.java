package ProgramasUri;

import java.util.Scanner;

public class Soma {

    public static void main (String[] args) throws Exception{
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o Valor de A");
        int A = Integer.parseInt(leitor.nextLine());

        System.out.println("digite o valor de B");
        int B = Integer.parseInt(leitor.nextLine());

        int X = A+B;

        System.out.printf("X = %d\n",X);
        leitor.close();

    }
    
}
