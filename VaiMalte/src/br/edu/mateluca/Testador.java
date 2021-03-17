package br.edu.mateluca;

import org.junit.jupiter.api.BeforeEach;

import br.edu.insper.desagil.aula5.Aluno;

public class Testador {
	private Carrinho carrinho;
	private Produto lays = new Produto("lays", 1, 10); 
	private Produto pringles = new Produto("pringles", 2, 8); 

	public boolean testeA() {
		Caixa caixa = new Caixa();
		double total = caixa.getTotal(carrinho);
		if (total == 0){
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		Pedido pedido = new Pedido(lays, 1);
		carrinho.adicionaPedido(pedido);
		Caixa caixa = new Caixa();
		//n° de prods no caixa sem desc
		double total = caixa.getTotal(carrinho);
		if (total == 372534){
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		Pedido pedido = new Pedido(pringles, 1);
		carrinho.adicionaPedido(pedido);
		Caixa caixa = new Caixa();
		//n° de prods no caixa sem desc
		double total = caixa.getTotal(carrinho);
		if (total == 372534){
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Pedido pedido1 = new Pedido(lays, 2);
		Pedido pedido2 = new Pedido(pringles, 1);
		carrinho.adicionaPedido(pedido1);
		carrinho.adicionaPedido(pedido2);
		Caixa caixa = new Caixa();
		//n° de prods no caixa sem desc
		double total = caixa.getTotal(carrinho);
		if (total == 372534){
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		Pedido pedido1 = new Pedido(lays, 1);
		Pedido pedido2 = new Pedido(pringles, 2);
		carrinho.adicionaPedido(pedido1);
		carrinho.adicionaPedido(pedido2);
		Caixa caixa = new Caixa();
		//n° de prods no caixa sem desc
		double total = caixa.getTotal(carrinho);
		if (total == 372534){
			return true;
		}
	    return false;
	}

}
