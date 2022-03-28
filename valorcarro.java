import java.util.Scanner;

public class valorcarro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float valor, valorf, imposto, pd;
		
		System.out.printf("Digite o valor do carro: %n");
		valor = ler.nextFloat();
		
		imposto = (float) (valor * 0.45);
		
		pd = (float) (valor * 0.28);

		valorf = (valor)+(imposto)+(pd);
		
		System.out.printf("O valor final do carro é de %.2f", valorf);
	}

}