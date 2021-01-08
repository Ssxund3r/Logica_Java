package vetores_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_matriz_for_vet {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int M, N, i, j;
			
			System.out.print("Quantas linhas vai ter a matriz? ");
		    M = sc.nextInt();
		    System.out.println("Quantas colunas vai ter a matriz? ");
		    N = sc.nextInt();
		    
		    int [][] mat = new int [M][N];
		    
		    for (i = 0; i < M; i++) {
		    	for (j = 0; j < N; j++) {
		    		System.out.print("Elemento [" + i + "," + j + "]: ");
		    		mat [i][j] = sc.nextInt();
		    	}
		    }
			System.out.println("\nMATRIZ DIGITADA: ");
			for (i = 0; i < M; i++) {
				for (j = 0; j < N; j++) {
					System.out.println(mat[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();
	}

}
