package controller;

import java.util.List;

import model.Item;
import model.Orcamento;

public class PIS implements Calcular{
	
	double PIS = 0.0065;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return PIS * somaItens;
	}
	

}
