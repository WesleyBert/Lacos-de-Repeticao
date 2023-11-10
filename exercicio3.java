package LaçosDeRepetição;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int idade = 0, maior = 0,menor = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade da pessoa: ");
		idade = leitor.nextInt();
		while(idade > 0) {
			if(idade < 21) {
				menor++;
			}else if (idade > 50) {
				maior++;
			}
			System.out.println("Digite a idade da pessoa: ");
			idade = leitor.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos:" + menor);
		System.out.println("\nTotal de pessoas menores de 50 anos:" + maior);
		
	}

}
