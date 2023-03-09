package impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS() {
		this.novoImposto = null;
	}
	
	public ICMS(Imposto novoImposto) {
		super(novoImposto);
	}

	double ICMS = 0.17;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return (ICMS * somaItens) + + calOutroImposto(orcamento);
	}
	
	@Override
	protected double calOutroImposto(Orcamento orcamento) {
		if(novoImposto == null) {
			return 0;
		}
		return novoImposto.calcular(orcamento);
	}
}
