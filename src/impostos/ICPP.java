package impostos;

import model.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{

	@Override
	public boolean DeveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() >= 500;
	}

	@Override
	public double MaximaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() * 0.07;
	}

	@Override
	public double MinimaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() * 0.05;
	}

}
