package vetores_matrizes;

import java.util.Scanner;

public class Estrutura_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.println("Digite uma hora do dia: ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia! ");
		}
		else {
			System.out.println("Boa tarde! ");
		}
		
		sc.close();	
	}
     
}
