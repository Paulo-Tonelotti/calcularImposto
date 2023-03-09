package descontos;



import model.Orcamento;

public class CalculaDesconto {
	
	public double calculaDesc(Orcamento orcamento) {
		
		Desconto d1 = new DescontoCincoItens();
		Desconto d2 = new DescontoQuinhetosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		
		
		return d1.Desconta(orcamento);
	}
}
