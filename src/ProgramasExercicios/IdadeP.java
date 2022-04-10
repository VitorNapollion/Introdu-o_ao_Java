package ProgramasExercicios;

import javax.swing.JOptionPane;

public class IdadeP {

    public static void main (String [] args){
        String idadeString = JOptionPane.showInputDialog("Qual a sua Idade?");
        int idade = Integer.parseInt(idadeString);
        //int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade?"));

        JOptionPane.showMessageDialog(null, idade + " anos, ta ficando velho em");
    }
    
}
