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
	
	public void incremento() {
		quantidade++;
	}
		
	public double devolveTotal(this.produto.getPreço(), this.quantidade){
		double total = produto.preço*quantidade;
		return total;
	}
}
