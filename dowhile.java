import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,i=0;
		
		
		do {
			System.out.printf("Insira um numero:");
			x = ler.nextInt();
			System.out.printf("o quadrado de %d = %d %n",x,x*x);
			i++;
		}while(i<100);

	}

}
