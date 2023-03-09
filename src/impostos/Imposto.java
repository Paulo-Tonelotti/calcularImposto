package impostos;

import model.Orcamento;

public abstract class Imposto {
	
	public Imposto novoImposto;
	
	public void setNovoImposto(Imposto novoImposto) {
		this.novoImposto = novoImposto;
	}
	public Imposto getNovoImposto() {
		return novoImposto;
	}
	
	public Imposto(Imposto novoImposto) {
		this.novoImposto = novoImposto;
	}
	
	public abstract double calcular(Orcamento orcamento);
	
	protected double calOutroImposto(Orcamento orcamento) {
		if(novoImposto == null) {
			return 0;
		}
		
		return novoImposto.calcular(orcamento);
	}
	
	public Imposto() {
		this.novoImposto = null;
	}
}
