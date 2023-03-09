package impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class PIS extends Imposto{
	
	public PIS() {
		this.novoImposto = null;
	}
	
	public PIS(Imposto novoImposto) {
		super(novoImposto);
	}

	double PIS = 0.0065;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return (PIS * somaItens) + calOutroImposto(orcamento);
	}
	
	@Override
	protected double calOutroImposto(Orcamento orcamento) {
		if(novoImposto == null) {
			return 0;
		}
		return novoImposto.calcular(orcamento);
	}

}
