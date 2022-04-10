package ProgramasExercicios;

import javax.swing.JOptionPane;

public class CalculadorMedia {
    public static void main (String[] args){
        String nota1Str = JOptionPane.showInputDialog("Qual sua Primeira nota?");
        double nota1 = Double.parseDouble(nota1Str);

        String nota2Str = JOptionPane.showInputDialog("Qual sua Segunda nota?");
        double nota2 = Double.parseDouble(nota2Str);

        String nota3Str = JOptionPane.showInputDialog("Qual sua Terceira nota?");
        double nota3 = Double.parseDouble(nota3Str);

        double media = (nota1 + nota2 + nota3) / 3;
        String nota = String.format("Sua média é %.1f", media);

        JOptionPane.showMessageDialog(null, nota);




    }
    
}

//outra maneira de fazer o código

//import javax.swing.JOptionPane;

//public class CalculaMedia {
    //public static void main (String[] args){
        
        //double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Primeira nota?"));
        
        //double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Segunda nota?"));
        
        //double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Terceira nota?"));

        //double media = ((nota1 + nota2 + nota3) / 3);
        //String nota = String.format("Sua média é %.1f", media);

        //JOptionPane.showMessageDialog(null, nota);




    //}
    
//}

