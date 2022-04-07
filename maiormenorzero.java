import java.util.Scanner;

public class maiormenorzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float x, y;

		System.out.printf("Digite o 1º num: %n");
		x = ler.nextFloat();

		System.out.printf("Digite o 2º num: %n");
		y = ler.nextFloat();

		if (x >= 0 && y >= 0) {

			if (x == 0 || y == 0) {
				System.out.printf("Um dos numeros é igual a zero");
			} else {
				System.out.printf("Ambos numeros são maiores que zero");
			}
		} else if (x <= 0 && y <= 0) {
			
			if (x == 0 || y == 0) {
				System.out.printf("Um dos numeros é igual a zero");
			} else {
				System.out.printf("Ambos numeros são menores que zero");
			}
		} else {
			System.out.printf("Um numero é maior e o outro menor que zero");
		}
	}

}
