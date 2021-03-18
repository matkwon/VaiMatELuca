package br.edu.mateluca;

import org.junit.jupiter.api.BeforeEach;

import br.edu.insper.desagil.aula5.Aluno;

public class Testador {
	
	private Produto pringles = new Produto("pringles", 1, 8.0); 
	private Produto lays = new Produto("lays", 2, 10.0); 

	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		double total = caixa.getTotal(carrinho);
		if (total == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.pringles);
		
		Caixa caixa = new Caixa();
		double total = caixa.getTotal(carrinho);
		if (total == 8.0) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.lays);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.lays, 10);
		
		double total = caixa.getTotal(carrinho);
		if (total == 9.0) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.pringles);
		carrinho.adicionaProduto(this.pringles);
		carrinho.adicionaProduto(this.lays);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.pringles, 10);
		
		double total = caixa.getTotal(carrinho);
		if (total == 24.4) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.pringles);
		carrinho.adicionaProduto(this.lays);
		carrinho.adicionaProduto(this.lays);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.lays, 15);
		
		double total = caixa.getTotal(carrinho);
		if (total == 25.0) {
			return true;
		}
	    return false;
	}

}
