import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		
		System.out.printf("Digite sua idade em anos: %n");
		anos = ler.nextInt();
		
		System.out.printf("Digite os meses restantes: %n");
		meses = ler.nextInt();
		
		System.out.printf("Digite os dias restantes: %n");
		dias = ler.nextInt();
		
		total = ((anos * 365)+(meses * 30)+dias);
		
		System.out.printf("Sua idade em dias é igual a %d", total);
	}

}
