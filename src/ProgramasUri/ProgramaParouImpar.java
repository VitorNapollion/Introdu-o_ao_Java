package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class ProgramaParouImpar {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        for(int i=0; i<n; i++){
            int numero = Integer.parseInt(leitor.nextLine());
            if(numero == 0){
                System.out.println("NULL"); //numero for igual a zero é Nulo

            } else if(numero %2 == 0 && numero < 0){ //numero é par negativo
                System.out.println("EVEN NEGATIVE");
            } else if(numero %2 == 0 && numero > 0){
                System.out.println("EVEN POSITIVE"); //numero é par positivo

            } else if(numero < 0){
                System.out.println("ODD NEGATIVE"); // numero é impar negativo
            } else {
                System.out.println("ODD POSITIVE"); // numero é impar positivo

            }

        }

        leitor.close();

 
    }
 
}