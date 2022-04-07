import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float compras, bonus;
		
		System.out.printf("Digite o valor das compras: %n");
		compras = ler.nextFloat();
		
		if (compras <= 50000) {
			bonus = (float) (compras*0.10);
			System.out.printf("O bonus será de %.2f", bonus);		
		} else {
				bonus = (float) (compras*0.15);
				System.out.printf("O bonus será de %.2f", bonus);
			}
	
	}

}
