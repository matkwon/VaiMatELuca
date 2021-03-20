package br.edu.mateluca;

public class Pedido {
	
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto; 
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementaUm() {
		this.quantidade++;
	}
	
	public double valorBruto() {
		double total = this.produto.getPreco() * this.quantidade;
		return total;
	}
}
