package ProgramasExercicios;

import javax.swing.JOptionPane;

public class CalculadorImc {

    public static void main (String [] args){
        
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, "Olá " + nome + " seu lindo");

        String pesoString = JOptionPane.showInputDialog("Qual seu peso?");
        double peso = Double.parseDouble(pesoString);
       
        String alturaStr = JOptionPane.showInputDialog("Qual sua altura?");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);
        String texto = String.format("Seu IMC é de %.1f", imc);


        JOptionPane.showMessageDialog(null, texto);
        
        
    }
    
}

