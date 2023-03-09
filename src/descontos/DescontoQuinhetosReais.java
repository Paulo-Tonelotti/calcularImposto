package descontos;

import model.Orcamento;

public class DescontoQuinhetosReais implements Desconto {
	public Desconto proxDesconto;

	@Override
	public double Desconta(Orcamento orcamento) {
		if(orcamento.valorTotal() > 500) {
			return orcamento.valorTotal() * 0.07;
		} 
		
		return proxDesconto.Desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proxDesconto = desconto;
	}

}
