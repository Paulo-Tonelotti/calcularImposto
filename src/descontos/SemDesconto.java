package descontos;

import model.Orcamento;

public class SemDesconto implements Desconto {
	public Desconto proxDesconto;

	@Override
	public double Desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proxDesconto = desconto;
	}

}
