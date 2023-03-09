package impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class COFINS extends Imposto {
	
	public COFINS() {
		this.novoImposto = null;
	}
	
	public COFINS(Imposto novoImposto) {
		super(novoImposto);
	}

	double COFINS = 0.03;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return (COFINS * somaItens) + calOutroImposto(orcamento);
	}
	
	@Override
	protected double calOutroImposto(Orcamento orcamento) {
		if(novoImposto == null) {
			return 0;
		}
		return novoImposto.calcular(orcamento);
	}

}
