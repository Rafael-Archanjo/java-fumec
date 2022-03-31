import java.util.Scanner;

public class condicionalSe {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int r,a;
		
		System.out.printf("Digite o Raio: %n");
		r = ler.nextInt();
		
		System.out.printf("Digite a Altura: %n");
		a = ler.nextInt();
		
		if(r>0) {
			System.out.printf("O volume é: %.2f %n", 3.14159*r*r*a);
		}

	}

}
