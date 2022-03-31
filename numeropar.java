import java.util.Scanner;

public class numeropar {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int n, a;

		System.out.printf("Digite o numero: %n");
		n = ler.nextInt();

		if (n % 2 == 0) {
			System.out.printf("O numero é par");
		} else {
			System.out.printf("O numero é impar");
		}
		
		/*
		  if (n % 2 != 0) {
		  System.out.printf("O numero é impar");
			
		} else {
			System.out.printf("O numero é par");
		}
		 */
	}
}
