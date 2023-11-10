package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n1,x,par = 0, impar = 0;
		

		for(x = 1; x <= 10; x++) {
			System.out.println("Digite o número: ");
			n1 = leitor.nextInt();
			if(n1 % 2 == 0) {
				par ++;	
			}else {
				impar++;
			}
			
		}
		System.out.println("Total de números pares: "+ par);
		System.out.println("Total de números impares: "+ impar);
	}

}
