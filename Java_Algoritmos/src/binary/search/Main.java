package binary.search;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = new int[1000000];
		
		for(int i = 0; i < vetor.length; i++) {
			
			vetor[i] = i * 2;
			//System.out.println(vetor[i]);
			
		}
		
		System.out.println("Digite o numero que sera buscado");
		Scanner scan = new Scanner(System.in);
		int numeroBuscado = scan.nextInt();
		
		boolean achou = false;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		int count = 0;
		
		while(inicio <= fim) {
			meio = (int) ((inicio + fim) / 2);
			count++;
			if(vetor[meio] == numeroBuscado) {
				achou = true;
				break;
			} else if(vetor[meio] < numeroBuscado) {
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		
		System.out.println("Numero de contagem: " + count);
		
		if(achou) {
			System.out.println("Numero encontrado");
		} else {
			System.out.println("Numero NAO encontrado");
		}
		
		
		scan.close();
		
	}

}
