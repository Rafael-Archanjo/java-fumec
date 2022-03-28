import java.util.Scanner;

public class Ativ1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float tempC;
		float tempF;
		
		System.out.printf("Digite a temperatura em °C: %n");
		tempC = ler.nextFloat();
		
		//(°C x 1.8) + 32 = °F
		
		tempF = (float) ((tempC*1.8)+32);
		System.out.printf("A temperatura em °F é de %.2f",tempF);
		
	}
}
