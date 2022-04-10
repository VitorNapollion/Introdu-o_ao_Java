package ProgramasExercicios;
import javax.swing.JOptionPane;

public class Pstrings {
    
    public static void main (String[] args){
        boolean continuar = true;  
        while(continuar == true){//repetidor
            String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
            char Pletra = nome.charAt(0); //pega a primeira letra
            char Uletra = nome.charAt(nome.length() - 1);//pega a ultima letra
        
            System.out.println("A primeira Letra é: " + Pletra);
            System.out.println("A ultima letra é: " + Uletra);
            String Nmaiuscula = nome.toUpperCase();//deixa tudo em maiusculo
            System.out.println("O nome em Maiusculo é: " + Nmaiuscula);
            String Nminuscula = nome.toLowerCase();//deixa tudo em Minusculo
            System.out.println("O nome em Minusculo é: " + Nminuscula);
            int Tnome = nome.length();//ler o tamanho do nome
            System.out.println("O tamanho do nome é: " + Tnome);
            String Svazios = nome.trim();
            int Tvazios = Svazios.length();//ler o tamanho do nome sem espaços vazios
            System.out.println("O tamanho do nome sem vazios: " +  Tvazios);
            boolean ComecomR = nome.startsWith("R");//verifica se começa com letra 

            if (ComecomR){//condição caso seja uma ou outra
                //if (ComecomR == true) não precisa
                System.out.println("Começa com R");
            } else if (nome.startsWith("V")){
                System.out.println("Começa com V");
            } else {
                System.out.println("Não Começa com nem R nem V");
            }
            String Qcontinuar = JOptionPane.showInputDialog(null, "Quer continuar(S/N)? ");
            if (Qcontinuar.startsWith("N") || Qcontinuar.startsWith("n")) {
            //if (Qcontinuar.toUpperCase().startsWith("N")) uma maneira sem usar o OR || //
                
                continuar = false;

            }

        
        }//fim do while


    }//fim do main

    
}//fim da classe
