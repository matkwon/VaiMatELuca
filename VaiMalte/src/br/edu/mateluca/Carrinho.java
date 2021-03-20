package br.edu.mateluca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Pedido> pedidos;

	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void adicionaProduto(Produto produto) {
		boolean existe = false;
		for (Pedido pedido : pedidos) {
			if (pedido.getProduto() == produto) {
				existe = true;
				pedido.incrementaUm();
			}
		}
		if (!existe) {
			pedidos.add(new Pedido(produto));
		}
	}
	
}
