
import java.util.Locale;

public class Saida_dados5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 24;
		salario = 4560.9;
		nome = "Gabriel Costa";
		sexo = 'M';
		
		System.out.println("O funcionario " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem "+ idade + " anos");
	}

}
