package descontos;

import model.Orcamento;

public class DescontoQuinhetosReais implements Desconto {

	@Override
	public double CalculaDesc(Orcamento orcamento) {
		if(orcamento.valorTotal() > 500) {
			return orcamento.valorTotal() * 0.07;
		} else {	
			return 0;
		}
	}

}
