package descontos;

import model.Orcamento;

public class DescontoCincoItens implements Desconto {
	
	public Desconto proxDesconto;
	

	@Override
	public double Desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.valorTotal() * 0.1;
		}
		
		return proxDesconto.Desconta(orcamento);
	}


	@Override
	public void setProximo(Desconto desconto) {
		this.proxDesconto = desconto;
		
	}

}
