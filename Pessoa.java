package br.com.charles;

public class Pessoa {

	private String nome;
	private Character genero;

	public Pessoa(String nome, Character genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public Character getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + "]";
	}

}
