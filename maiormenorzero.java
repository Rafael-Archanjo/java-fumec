import java.util.Scanner;

public class maiormenorzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float x, y;
		
		System.out.printf("Digite o 1� num: %n");
		x = ler.nextFloat();
		
		System.out.printf("Digite o 2� num: %n");
		y = ler.nextFloat();
		
		if (x >= 0 && y >= 0) {
			if (x == 0 || y == 0) {
				System.out.printf("Um dos numeros � igual a zero");
			} else {
			System.out.printf("Ambos numeros s�o maiores que zero");
			}
		}
		if (x <= 0 && y <= 0) {
			if (x == 0 || y == 0) {
				System.out.printf("Um dos numeros � igual a zero");
			} else {
			System.out.printf("Ambos numeros s�o menores que zero");
			}
		}
		
		if (x > 0 && y < 0 || x < 0 && y > 0) {
			System.out.printf("Um numero � maior e o outro menor que zero");
		}
	}

}
