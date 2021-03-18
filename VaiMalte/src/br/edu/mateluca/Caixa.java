package br.edu.mateluca;

import java.util.HashMap;
import java.util.Map;

public class Caixa {

	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void adicionaDesconto(Produto produto, int desconto) {
		if (desconto > 0 && desconto < 100) {
			descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double getTotal(Carrinho carrinho) {
		double total = 0;
		for (Pedido pedido : carrinho.getPedidos()) {
			Produto produto = pedido.getProduto();
			int codigo = produto.getCodigo();
			if (descontos.containsKey(codigo)) {
				total += pedido.valorBruto() * (double) descontos.get(codigo)/100;
			} else {
				total += pedido.valorBruto();
			}
		}
		return total;
	}

}
