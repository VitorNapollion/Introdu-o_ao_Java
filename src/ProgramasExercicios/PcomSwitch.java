package ProgramasExercicios;

import java.util.Scanner;

public class PcomSwitch {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Escolha uma opção:\n1.Bebida\n2.Comida\n3.Sair");
            String opcao = leitor.nextLine();
            
            switch(opcao){
                case "1":
                    System.out.println("Você quer uma Coquinha gelada");
                    break;
                case "2":
                    System.out.println("Você quer uma Pizza");
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida Jovem");
    
            }
        }
        
        leitor.close();

    }
    
}
