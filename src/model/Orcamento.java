package model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	double valor;
	List<Item> itens = new ArrayList<Item>();
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valorInicial) {
		this.valor = valorInicial;
	}

	

}
