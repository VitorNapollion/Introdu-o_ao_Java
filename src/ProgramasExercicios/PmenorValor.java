package ProgramasExercicios;

import java.util.Locale;
import java.util.Scanner;

public class PmenorValor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores você quer testar? ");
        int quantV = Integer.parseInt(leitor.nextLine());
        double[] valores = new double[quantV];

        for (int k = 0; k < quantV; k++) {
            System.out.println("Digite um valor:");
            double valor = leitor.nextDouble();
            valores[k] =valor;
        }
        double menor = valores[0];
        for (int k=1; k< valores.length; k++){
            if(valores[k]< menor){
                menor = valores[k];
            }
        }
    
        System.out.printf("O menor valor é %.2f: ",menor);
        leitor.close();
 
    }
}
