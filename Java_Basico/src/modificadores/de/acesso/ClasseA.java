package modificadores.de.acesso;

public class ClasseA {
	
	// Quando um atributo é private ele não pode ser acessado fora
	// da classe que foi criado.
	private String senha = "123";
	
	// Quando o modificador é vazio ele pode ser acessado por classes
	// do mesmo pacote.
	String senha2 = "321";
	
	// Public pode ser acesado por qualquer classe independente do pacote.
	public String senha3 = "543";
	
	// Protect só vai ser utilizada se a classe fora do pacote herdar.
	protected String senha4 = "1234";
}
