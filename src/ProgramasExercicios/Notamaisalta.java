package ProgramasExercicios;

import java.util.Scanner;
public class Notamaisalta {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULANDO NOTAS DA TURMA");
		System.out.println("Quantos alunos há na turma?");
		int numAlunos = Integer.parseInt(leitor.nextLine());
		String[] listaNomes = new String[numAlunos];
		double[] listaNotas = new double[numAlunos];
		for (int k = 0; k < numAlunos; k++) {
			System.out.println("Qual o nome do aluno [" + (k + 1) + "]");
			listaNomes[k] = leitor.nextLine();
			System.out.println("Qual a nota do aluno [" + (k + 1) + "]");
			listaNotas[k] = Double.parseDouble(leitor.nextLine());
		}
      
		//double maior = 0.0;
        //String nomeMaior = "";
        //for(int k=0; k < listaNotas.length; k++){
            //if(listaNotas[k]>=maior){
             //   maior = listaNotas[k];
               // nomeMaior = listaNomes[k];
            //}
        //}
        //System.out.printf("A maior nota é %.2f de %s\n",maior, nomeMaior);
		System.out.println("Fim do programa");
		leitor.close();
	}
}