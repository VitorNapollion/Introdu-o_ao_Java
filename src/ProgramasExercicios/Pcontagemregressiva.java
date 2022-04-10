package ProgramasExercicios;

import java.util.Scanner;

public class Pcontagemregressiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um Numero ");
        int n = Integer.parseInt(leitor.nextLine());
        System.out.println("Contagem regressiva... ");
        
        for(int c = n; c > 0; c--){
            System.out.println(c);

        }



        leitor.close();

    }
    
}
