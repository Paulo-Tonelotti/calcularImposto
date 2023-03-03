package controller.descontos;


import java.util.ArrayList;
import java.util.List;

import model.Orcamento;

public class CalculaDesconto {
	
	public double calculaDesc(Orcamento orcamento) {
		double desconto = 0;
		
		Desconto desc1 = new DescontoCincoItens();
		Desconto desc2 = new DescontoQuinhetosReais();
		Desconto desc3 = new SemDesconto();
		
		List<Desconto> descontos = new ArrayList<Desconto>();
		descontos.add(desc1);
		descontos.add(desc2);
		descontos.add(desc3);
		
		for (Desconto d : descontos) {
			if (d.CalculaDesc(orcamento) != 0) {
				desconto = d.CalculaDesc(orcamento);
				break;
			}
		}
		
		return desconto;
	}
}
