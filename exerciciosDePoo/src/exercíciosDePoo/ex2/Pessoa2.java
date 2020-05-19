package exercíciosDePoo.ex2;

public class Pessoa2 {
	// atributos
	private String nome;
	private int ano;

	// método construtor - mesmo nome da classe
	public Pessoa2(String nome, int ano) {
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void mostraAno() {
		System.out.println(getNome() + ", sua idade é de " + (2020 - getAno()) + " anos.");
	}
	
	public void calculaIdade50() {
		System.out.println(getNome() + ", sua idade daqui a 50 anos é de " + ((2020 + 50) - getAno()) + " anos.");
	}
}
