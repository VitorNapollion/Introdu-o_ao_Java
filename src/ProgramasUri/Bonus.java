package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Bonus {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        //System.out.println("Qual o nome do Vendedor? ");
        String nome = leitor.nextLine();

        //System.out.println("Qual o Salario do Vendedor? ");
        double salario = Double.parseDouble(leitor.nextLine());

        //System.out.println("Qual o total de Vendas? ");
        double vendas = Double.parseDouble(leitor.nextLine());

        double TOTAL = salario + (0.15 * vendas);

    
        System.out.printf(nome + " Recebeu um " + "TOTAL = R$ %.2f\n", TOTAL);

        leitor.close();

 
    }
 
}