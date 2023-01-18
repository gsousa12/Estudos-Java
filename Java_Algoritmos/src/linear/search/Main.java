package linear.search;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = new int[8];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100); // Cast
			
			System.out.println(vetor[i]);
		}
		
		System.out.println("Digite o valor deseja buscar: ");
		Scanner scan = new Scanner(System.in);
		
		int numeroBuscadoPeloUsuario = scan.nextInt();
		
		boolean achouNumero = false;
		
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numeroBuscadoPeloUsuario) {
				achouNumero = true;
				break;
			}
		}
		
		if(achouNumero) {
			System.out.println("Achou");
		} else {
			System.out.println("NÃO achou");
		}

	}

}
