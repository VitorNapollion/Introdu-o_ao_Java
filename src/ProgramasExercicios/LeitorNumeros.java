package ProgramasExercicios;
import java.util.Scanner;

public class LeitorNumeros {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        String NlidosStr = leitor.nextLine();
        String [] ListaNStr = NlidosStr.split(" ");
        int num1 = Integer.parseInt(ListaNStr[0]);
        int num2 = Integer.parseInt(ListaNStr[1]);
        int num3 = Integer.parseInt(ListaNStr[2]);
        int soma = num1 + num2 + num3;
        System.out.printf("A soma de %d+%d+%d=%d\n",num1,num2,num3,soma);

        leitor.close();
    }
    
}
