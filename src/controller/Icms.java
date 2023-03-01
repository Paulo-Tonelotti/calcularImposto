package controller;



public class Icms implements Calcular {
	double ICMS = 0.17;

	@Override
	public double calcular(double valor) {
		double valorFinal = (valor * ICMS) + valor;
		
		return valorFinal;
	}
	

}
