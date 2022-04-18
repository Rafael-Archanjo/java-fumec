import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, y;

		System.out.printf("Digite o cod. do tipo produto: %n");
		x = ler.nextInt();

		switch (x) {
		case 1:
			System.out.printf("Alimento não perecivel");
			System.out.printf("%n Digite 1 para Arroz %n Digite 2 para Feijão %n Digite 3 para Macarrão %n");
			y = ler.nextInt();
			switch (y) {
			case 1:
				System.out.printf("Arroz");
				break;

			case 2:
				System.out.printf("Feijão");
				break;

			case 3:
				System.out.printf("Macarrão");
				break;

			default:
				System.out.printf("Produto não encontrado");
			}

			break;

		case 2:
			System.out.printf("Alimento perecivel");
			break;

		case 3:
			System.out.printf("Vestuario");
			break;

		case 4:
			System.out.printf("Limpeza");
			break;

		default:
			System.out.printf("Item não encontrado");
		}

	}

}
