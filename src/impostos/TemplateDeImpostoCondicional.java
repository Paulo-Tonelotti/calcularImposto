package impostos;

import model.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		if(DeveUsarMaximaTaxacao(orcamento)) {
			return MaximaTaxacao(orcamento);
		} else {			
			return MinimaTaxacao(orcamento);
		}
	}
	
	public abstract boolean DeveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double MaximaTaxacao(Orcamento orcamento);
	public abstract double MinimaTaxacao(Orcamento orcamento);
	

}
