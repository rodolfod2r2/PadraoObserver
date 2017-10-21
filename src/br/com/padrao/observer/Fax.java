package br.com.padrao.observer;

public class Fax extends Observer {
	
	private String fabricante;
	private int codigo;

	public Fax(String fabricante, int codigo) {
		this.fabricante = fabricante;
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	void notificar() {
		System.out.println(getCodigo());
	}
}
