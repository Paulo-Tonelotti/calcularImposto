package executavel;

import controller.COFINS;
import controller.ICMS;
import controller.ISS;
import controller.PIS;
import model.Item;
import model.Orcamento;

public class CalculaOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("Camisa Flamengo", 459.90));
		orcamento.adicionaItem(new Item("Camisa Palmeiras", 200.00));
		orcamento.adicionaItem(new Item("Camisa Corinthians", 399.99));
		orcamento.adicionaItem(new Item("Camisa São Paulo", 299.99));
		orcamento.adicionaItem(new Item("Camisa Vasco", 100.00));
		orcamento.adicionaItem(new Item("Camisa Santos", 250.00));
		
		double icms = new ICMS().calcular(orcamento);
		double iss = new ISS().calcular(orcamento);
		double cofins = new COFINS().calcular(orcamento);
		double pis = new PIS().calcular(orcamento);
		
		
		System.out.println("ICMS: " + icms);
		System.out.println("ISS: " + iss);
		System.out.println("COFINS: " + cofins);
		System.out.println("PIS: " + pis);
	}
}
