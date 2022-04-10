package ProgramasExercicios;

import javax.swing.JOptionPane;

public class Calculadesconto {
    public static void main (String[] args){
        String valorStr = JOptionPane.showInputDialog("Qual o valor do produto?");
        String descontoStr = JOptionPane.showInputDialog("Qual o Desconto?");

        double valorP = Double.parseDouble(valorStr);
        //double valorP = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
        double descontoP = Double.parseDouble(descontoStr);
        //double descontoP = Double.parseDouble(JOptionPane.showInputDialog("Qual o Desconto?"));
        double valorD = (valorP - (valorP * descontoP) / 100);

        String total = String.format("Você vai pagar R$: %.2f", valorD);

        JOptionPane.showMessageDialog(null, total );

        



    }
    
}

