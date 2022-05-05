import java.util.Scanner;

public class while_ativ {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,y,i = 0;
		
		System.out.printf("Insira o numero de repetições: %n");
		x = ler.nextInt();

		
		while (i < x) {
			i++;
			y = (i * i);
			System.out.printf("%d vezes %d é igual a %d %n",i,i,y);
		}
		
	}

}
