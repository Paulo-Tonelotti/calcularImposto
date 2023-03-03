package impostos;

public class CalculaTotal {
	
	public double calculaTotal(double valorOrc,
			double icms, double iss, double cofins, double pis, 
			double desconto) {
		
		return (valorOrc + icms + iss + cofins + pis) - desconto;
		
	}
}
