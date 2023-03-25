package impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	public boolean DeveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() > 500 && TemItemMaiorQue100Reais(orcamento);
	}

	@Override
	public double MaximaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() * 0.10;
	}

	@Override
	public double MinimaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() * 0.06;
	}
	
	private boolean TemItemMaiorQue100Reais(Orcamento orcamento) {
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			if((int) item.getValor() > 100) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
