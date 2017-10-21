package br.com.padrao.observer;



public class Pessoa extends Observer {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	@Override
	void notificar() {
		System.out.println(getNome());
	}
}
