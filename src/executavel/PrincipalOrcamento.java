package executavel;

import descontos.CalculaDesconto;
import impostos.COFINS;
import impostos.ICMS;
import impostos.IHIT;
import impostos.ISS;
import impostos.Imposto;
import impostos.PIS;
import impostos.TemplateDeImpostoCondicional;
import model.Item;
import model.Orcamento;

public class PrincipalOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("Caneta", 200));
		orcamento.adicionaItem(new Item("Borracha", 100));
		orcamento.adicionaItem(new Item("Lápis", 300));
		orcamento.adicionaItem(new Item("Caneta", 200));
		orcamento.adicionaItem(new Item("Tesoura", 300));
		orcamento.adicionaItem(new Item("Régua", 300));
		
		Imposto impostoEncadeado = new ISS(new PIS(new ICMS(new COFINS())));
		double imposto =  impostoEncadeado.calcular(orcamento);
		
		double desconto = new CalculaDesconto().calculaDesc(orcamento);
		TemplateDeImpostoCondicional template = new IHIT();
		double templateCalculado = template.calcular(orcamento);
		
		System.out.printf("VALOR ORÇAMENTO: %.2f\n", orcamento.valorTotal());
		System.out.println("---------------------------");
		System.out.printf("IMPOSTOS: %.2f\n", imposto);
		System.out.printf("DESCONTO: %.2f\n" , desconto);
		System.out.printf("IMPOSTO TEMPLATE: %.2f\n", templateCalculado);
		System.out.println("---------------------------");
	}
}
