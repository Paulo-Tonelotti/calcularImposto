package model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	List<Item> itens = new ArrayList<Item>();
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	
	public double valorTotal() {
		double valorTotal = 0;
		for (Item item : this.itens ) {
			valorTotal += item.getValor();
		}
		return valorTotal;
		
	}

	

}
