package LaçosDeRepetição;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int n, resultado = 0;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			n = leitor.nextInt();
			if(n > 0) {
				resultado += n; 
			}
		}while(n != 0);
		System.out.println("A soma dos números positivos é: " + resultado);
}
}