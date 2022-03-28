import java.util.Scanner;

public class salpercent {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float sal, perc;
		
		System.out.printf("Digite seu salario base %n");
		sal = ler.nextFloat();
		
		System.out.printf("Digite o percentual da mudança %n");
		perc = ler.nextFloat();
		perc = (sal*(perc/100));
		
		sal = (sal+perc);
		
		System.out.printf("Seu salario atual é de: %.2f", sal);	}

}
