package descontos;

import model.Orcamento;

public class DescontoCincoItens implements Desconto {

	@Override
	public double CalculaDesc(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.valorTotal() * 0.1;
		} else {	
			return 0;
		}
	}

}
