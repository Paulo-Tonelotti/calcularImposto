package controller.descontos;


import model.Orcamento;

public class CalculaDesconto {
	
	public double calculaDesc(Orcamento orcamento) {
		double desconto = 0;
		DescontoCincoItens desc1 = new DescontoCincoItens();
		DescontoQuinhetosReais desc2 = new DescontoQuinhetosReais();
		SemDesconto desc3 = new SemDesconto();
		
		
		if(desc1.CalculaDesc(orcamento) != 0) {
			desconto =  desc1.CalculaDesc(orcamento);
		}else if (desc2.CalculaDesc(orcamento) != 0) {
			desconto = desc2.CalculaDesc(orcamento);
		} else {
			desconto = desc3.CalculaDesc(orcamento);
		}
		
		return desconto;
	}
}
