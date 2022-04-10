package ProgramasExercicios;

import java.util.Scanner;

public class Pgastoscomarray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        double [] valoresT = new double[5];
        for (int k=0; k<5; k++) {
            System.out.println("Quantos litros ?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            double total = qtdeLitros*precoGasolina;
            valoresT[k] = total;

           
        } 
        double somaA = 0.0;
        for(int k=0; k< valoresT.length; k++){
            somaA += valoresT[k];   
        }
        double media = somaA/5;
        double menorV = valoresT[0];
        for (int k=1; k< valoresT.length; k++){
            if(valoresT[k]< menorV){
                menorV = valoresT[k];
            }
        }
        System.out.printf("Menor valor: %.2f\n", menorV);
        System.out.printf("Média Abastecimentos: %.2f\n", media);
        leitor.close();

    }
}
