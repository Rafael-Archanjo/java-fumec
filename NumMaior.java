import java.util.Scanner;

public class NumMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int x,y;
		
		System.out.printf("Digite o numero X: %n");
		x = ler.nextInt();
		
		System.out.printf("Digite o numero Y: %n");
		y = ler.nextInt();
		
		
		if (x > y) {
			System.out.printf("O numero %d é o maior", x);
		} else if (y > x) { 
			System.out.printf("O numero %d é o maior", y);
		} else {
			System.out.printf("Os numeros são iguais");
		}
	}
}