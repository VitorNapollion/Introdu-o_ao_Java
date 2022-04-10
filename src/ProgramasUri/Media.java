package ProgramasUri;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Media {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double A = Double.parseDouble(leitor.nextLine());

        double B = Double.parseDouble(leitor.nextLine());

        double C = Double.parseDouble(leitor.nextLine());

        double MEDIA = (A*2 + B*3 + C*5) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        leitor.close();

 
    }
 
}
