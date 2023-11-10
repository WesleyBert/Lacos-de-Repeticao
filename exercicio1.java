package LaçosDeRepetição;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int n1,n2,x;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo:  ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for(x=n1; x <= n2; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					System.out.println(x + " é múltiplo de 3 e 5" );
				}
			}
		}else {
			System.out.println("Intervalo inválido!");
		}
	}
}