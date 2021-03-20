package br.edu.mateluca;

public class Testador {
	
	private Produto Heineken = new Produto("Heineken", 1, 8.0); 
	private Produto Budweiser = new Produto("Budweiser", 2, 10.0); 

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
		carrinho.adicionaProduto(this.Heineken);
		
		Caixa caixa = new Caixa();
		double total = caixa.getTotal(carrinho);
		if (total == 8.0) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.Budweiser);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.Budweiser, 10);
		
		double total = caixa.getTotal(carrinho);
		if (total == 9.0) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.Heineken);
		carrinho.adicionaProduto(this.Heineken);
		carrinho.adicionaProduto(this.Budweiser);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.Heineken, 10);
		
		double total = caixa.getTotal(carrinho);
		if (total == 24.4) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(this.Heineken);
		carrinho.adicionaProduto(this.Budweiser);
		carrinho.adicionaProduto(this.Budweiser);

		Caixa caixa = new Caixa();
		caixa.adicionaDesconto(this.Budweiser, 15);
		
		double total = caixa.getTotal(carrinho);
		if (total == 25.0) {
			return true;
		}
	    return false;
	}

}
