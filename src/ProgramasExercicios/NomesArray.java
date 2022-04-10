package ProgramasExercicios;

import javax.swing.JOptionPane;

public class NomesArray {
    public static void main (String[] args){
        System.out.println("Vamos guardar 10 nomes: ");
        int quantN = 10;
        String [] nomes = new String[quantN];
        for( int k = 0;  k< quantN; k++){
           nomes[k] = JOptionPane.showInputDialog("Diga um Nome");

        }
        System.out.println("Foram lidos os seguintes nomes...");
        for(int k=0; k< nomes.length; k++){
            System.out.println(nomes[k]);

        }
        
    }
    
}
