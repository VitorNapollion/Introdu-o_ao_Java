package ProgramasExercicios;

import javax.swing.JOptionPane;

public class Preço {

    public static void main (String [] args){
        int quantMA = Integer.parseInt(JOptionPane.showInputDialog("Quantas Maçãs?"));
        int quantMM = Integer.parseInt(JOptionPane.showInputDialog("Quantas Mamãos?"));

        double valorP = (quantMA * 1) + (quantMM * 3.50);

        String total = String.format("Você pagará R$: %.2f", valorP);

        JOptionPane.showMessageDialog(null, total);







    }
    
}
