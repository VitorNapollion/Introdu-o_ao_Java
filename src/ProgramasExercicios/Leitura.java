package ProgramasExercicios;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) throws Exception {       
        String filme;
        try (Scanner leitor = new Scanner(System.in)) {
            leitor.useDelimiter("[\r\n]+");
            System.out.println("Qual seu Filme favorito?");
            
            filme = leitor.next();
        }
        
        System.out.println("O Filme é " + filme);


     }
    
}
