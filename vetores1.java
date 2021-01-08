package vetores_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class vetores1 {

	public static void main(String[] args) {
		
	   Locale.setDefault(Locale.US);
	   @SuppressWarnings("resource")
	   Scanner sc = new Scanner(System.in);	   
	   
	   int N, i, x, soma;
	   
	   System.out.print("Quantos numeros serao digitados? ");
	   N = sc.nextInt();
	   
	   soma = 0;
	   for(i = 0; i < N; i++) {
	   System.out.print("Digite outro numero: ");
	   x = sc.nextInt();	   
	   soma = soma + x;
	   }
	   System.out.println("SOMA = " + soma);
	   
	   sc.close();
	}

}
