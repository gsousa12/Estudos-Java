package bubble.sort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}

	}

}
