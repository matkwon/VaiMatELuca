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
		
	public double devolveTotal(this.produto.getPre�o(), this.quantidade){
		double total = produto.pre�o*quantidade;
		return total;
	}
}
