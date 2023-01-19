package getset;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String time;
		Futebol torcida = new Futebol();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual seu time?");
		time = leitor.nextLine();
		
		torcida.setTime(time);
		torcida.mostrarTime();
	}

}
