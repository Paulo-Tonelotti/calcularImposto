package impostos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import model.Item;
import model.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	public boolean DeveUsarMaximaTaxacao(Orcamento orcamento) {
		List<Item> itens = orcamento.getItens();
		List<String> descricoes =  new ArrayList<String>();
		for (Item item : itens) {
			descricoes.add(item.getDescricao());
		}
		
		
		HashSet<String> set = new HashSet<String>(descricoes);
		
		if(set.size() == itens.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public double MaximaTaxacao(Orcamento orcamento) {
		return (orcamento.valorTotal() * 0.13) + 100;
	}

	@Override
	public double MinimaTaxacao(Orcamento orcamento) {
		return orcamento.valorTotal() * (0.01 * orcamento.getItens().size());
	}

}
