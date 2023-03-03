package executavel;

import descontos.CalculaDesconto;
import impostos.COFINS;
import impostos.CalculaTotal;
import impostos.ICMS;
import impostos.ISS;
import impostos.PIS;
import model.Item;
import model.Orcamento;

public class PrincipalOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("Caneta", 200));
		orcamento.adicionaItem(new Item("Borracha", 100));
		orcamento.adicionaItem(new Item("Lápis", 300));
		orcamento.adicionaItem(new Item("Caderno", 200));
		orcamento.adicionaItem(new Item("Tesoura", 300));
		orcamento.adicionaItem(new Item("Régua", 300));
		
		double icms = new ICMS().calcular(orcamento);
		double iss = new ISS().calcular(orcamento);
		double cofins = new COFINS().calcular(orcamento);
		double pis = new PIS().calcular(orcamento);
		
		double desconto = new CalculaDesconto().calculaDesc(orcamento);
		double total = new CalculaTotal().calculaTotal(orcamento.valorTotal(), icms, iss, cofins, pis, desconto);
		
		
		System.out.printf("VALOR ORÇAMENTO: %.2f\n", orcamento.valorTotal());
		System.out.println("---------------------------");
		System.out.printf("ICMS: %.2f\n", icms);
		System.out.printf("ISS: %.2f\n" , iss);
		System.out.printf("COFINS: %.2f\n" , cofins);
		System.out.printf("PIS: %.2f\n" , pis);
		System.out.printf("DESCONTO: %.2f\n" , desconto);
		System.out.println("---------------------------");
		System.out.printf("VALOR TOTAL: %.2f", total);
	}
}
