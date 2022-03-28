import java.util.Scanner;

public class Var_InserirDados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		
		System.out.printf("Digite sua idade %n");
		idade = ler.nextInt();
		
		System.out.printf("Você tem %d anos",idade);

	}

}
