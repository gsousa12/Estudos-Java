package modificadores.de.acesso2;

import modificadores.de.acesso.ClasseA;

public class ClasseC extends ClasseA{
	
	public static void main(String[] args) {
		ClasseA classeA = new ClasseA();
		
		System.out.println(classeA.senha3);
		
		ClasseC classeC = new ClasseC();
		System.err.println(classeC.senha4);
	}

}
