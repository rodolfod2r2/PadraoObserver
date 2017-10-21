package br.com.padrao.observer;

public class SecretariaEletronica extends Observer {

	private String numeroSerie;
	private String modelo;

	public SecretariaEletronica(String numeroSerie, String modelo) {
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	void notificar() {
		System.out.println(getModelo());
	}
}
