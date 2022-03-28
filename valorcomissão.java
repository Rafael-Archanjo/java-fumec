import java.util.Scanner;

public class valorcomissão {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salF, numVendas, valCom,totVend;
		float com, valVenda, salFinal;
		
		System.out.printf("Digite seu salario fixo: %n");
		salF = ler.nextFloat();
		
		System.out.printf("Digite o numeros de carros vendidos: %n");
		numVendas = ler.nextFloat();
		
		System.out.printf("Digite o valor da comissão por venda: %n");
		valCom = ler.nextFloat();
		
		System.out.printf("Digite o valor total das vendas %n");
		totVend = ler.nextFloat();
		
		com = (float) (numVendas*valCom);
		valVenda = (float) (totVend*0.05);
		salFinal = (float)(salF+com+valVenda);
		
		System.out.printf("O salario final será igual a: %.2f", salFinal);
		
		

	}

}
