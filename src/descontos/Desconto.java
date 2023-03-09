package descontos;

import model.Orcamento;

public interface Desconto {
	public double Desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
