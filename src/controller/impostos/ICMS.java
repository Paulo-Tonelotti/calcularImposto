package controller.impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class ICMS implements Calcular {
	double ICMS = 0.17;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return ICMS * somaItens;
	}
	

}
