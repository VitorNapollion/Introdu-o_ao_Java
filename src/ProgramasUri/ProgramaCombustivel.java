package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class ProgramaCombustivel {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        int  alcool = 0;
        int  gasolina = 0;
        int  diesel = 0;
        while( n != 4){

            if( n == 1){
                alcool++;

            } else if( n == 2){
                gasolina++;

            } else if(n == 3){
                diesel++;

            } 
            n = Integer.parseInt(leitor.nextLine());

        } 

        System .out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        leitor.close();

 
    }
 
}