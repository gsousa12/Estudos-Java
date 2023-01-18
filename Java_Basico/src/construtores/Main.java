package construtores;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Carlos", 42);
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Walter";
		p2.idade = 54;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);

	}

}
