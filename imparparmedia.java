import java.util.Scanner;

public class imparparmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float num,geral = 0,par = 0,impar =0,par_i = 0, imp_i = 0, i = 0;

		do {
			i++;
			System.out.printf("Insira um numero: %n");
			num = ler.nextFloat();
			
			if (num % 2 == 0) {
				par = num + par;
				par_i++;
			} else {
				impar = num + impar;
				imp_i++;
			}
			
			geral = num + geral;
						
		} while (i < 5);
		
		System.out.printf("A media dos numeros pares é de %.2f %n",(par/par_i) );
		System.out.printf("A media dos numeros impares é de %.2f %n",(impar/imp_i) );
		System.out.printf("A media de todos os numeros é de %.2f %n",(geral/5) );
	}
}
