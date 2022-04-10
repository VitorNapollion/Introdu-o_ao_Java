package ProgramasExercicios;

import java.util.Scanner;

public class PcomBreak {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);

        while(true){
            System.out.println("Escolha uma opção:\n1.Bebida\n2.Comida\n3.Sair");
            String opcao = leitor.nextLine();

            if(opcao.equals("1")){ //equals é se começa igual/igual a opção
                System.out.println("Você quer uma Coquinha gelada");
                
            } else if(opcao.equals("2")){
                System.out.println("Você quer uma pizza");

            } else if(opcao.equals("3")){ 
                break; //para bruscamente o programa sem precisar do boolean

            } else{
                System.out.println("opção invalida jovem");
            }
        }
        leitor.close();

    }
    
}
