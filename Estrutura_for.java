package vetores_matrizes;
import java.util.Scanner;

public class Estrutura_for {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    
		int N, i, x, soma;
		
		System.out.print("Quantos numeros serao digitados? ");
		N = sc.nextInt();
		
		soma = 0;
		for (i = 1; i < N; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("soma = " + soma);
		
		sc.close();
	}

}
