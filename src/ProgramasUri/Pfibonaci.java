package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Pfibonaci {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        if(n == 1){
            System.out.println("0");

        } else if(n == 2){
            System.out.println("0 1");

        } else{
            int penultimo = 0;
            int ultimo = 1;
            System.out.printf("0 1 ");
            for( int i = 2; i < n; i++){
                int atual = penultimo + ultimo;
            if (i == (n - 1)){
                System.out.printf(atual + "\n");

            } else {
                System.out.printf(atual + " ");

            }
            penultimo = ultimo;
            ultimo = atual;

            }
        } 
    
        leitor.close();

 
    }
 
}