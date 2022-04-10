package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Eprimo {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        int X, cont;
        for (int i = 0; i < n; i++) {
        	cont = 0;
        	X = leitor.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " eh primo");
        	else System.out.println(X + " nao eh primo");
        }
    
    
        leitor.close();

 
    }
 
}