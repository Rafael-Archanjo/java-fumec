import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float raio;
		float h;
		double pi=3.14159;
		float area;
		
		System.out.printf("Digite o raio da lata: %n");
		raio = ler.nextFloat();
		System.out.printf("Digite a altura da lata: %n");
		h = ler.nextFloat();
		area = (float) (pi*raio*raio*h);
		System.out.printf("A area da lata é igual a %.2f",area);
	}

}

/*Calcular e apresentar o volume de uma lata de óleo,
 *  utilizando, a fórmula: volume =
3.14159*raio*raio*altura. */