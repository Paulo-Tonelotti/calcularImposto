package controller.impostos;

import java.util.List;

import model.Item;
import model.Orcamento;

public class ISS implements Calcular{
	
	double ISS = 0.05;

	@Override
	public double calcular(Orcamento orcamento) {
		double somaItens = 0;
		List<Item> itens = orcamento.getItens();
		for (Item item : itens) {
			somaItens += item.getValor();
		}
		return ISS * somaItens;
	}
	
	

}
