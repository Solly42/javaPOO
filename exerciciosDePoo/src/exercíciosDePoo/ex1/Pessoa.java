package exercíciosDePoo.ex1;

public class Pessoa {
	// atributos
	private String nome;
	private String email;
	private String telefone;
	private int ano;

	// método construtor - mesmo nome da classe
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;

	}

	public Pessoa(String string, int ano) {
		this.nome = nome;
		this.ano = ano;
	}
	

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void mostraInfos() {
		System.out.println("Seu nome é: " + getNome());
		System.out.println("Seu email é: " + getEmail());
		System.out.println("Seu telefone é: " + getTelefone());
	}

}
