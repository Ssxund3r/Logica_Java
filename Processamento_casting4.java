package Processamentos_dados_casting;

import java.util.Locale;

public class Processamento_casting4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado =(double) a / b; 
		
		System.out.println(resultado);
	}

}
