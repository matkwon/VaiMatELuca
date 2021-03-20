package br.edu.mateluca;


public class Produto {
	
	private int codigo;
	private String nome;
	private double pre�o;
	
	public Produto(int codigo, String nome, double pre�o) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPre�o() {
		return pre�o;
	}
}
