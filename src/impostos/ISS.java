package impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class ISS extends Imposto{
	public ISS() {
		this.novoImposto = null;
	}
	
	public ISS(Imposto novoImposto) {
		super(novoImposto);
	}

	double ISS = 0.05;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return (ISS * somaItens) + calOutroImposto(orcamento);
	}
	
	protected double calOutroImposto(Orcamento orcamento) {
		if(novoImposto == null) {
			return 0;
		}
		return novoImposto.calcular(orcamento);
	}
	

}
