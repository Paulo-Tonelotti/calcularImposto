package controller.descontos;

import model.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double CalculaDesc(Orcamento orcamento) {
		return 0;
	}

}
