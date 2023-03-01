package executavel;

import java.util.Locale;
import java.util.Scanner;

import controller.Icms;
import model.OrcamentoModel;

public class CalculaOrcamento {

	public static void main(String[] args) {
		// Leitor dos dados
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US); // Seta localidade para definir ponto como separador

		OrcamentoModel orcamento = new OrcamentoModel();
		Icms icms = new Icms();
		
		double valorInicial = 0;
		double valorCalculado = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite um valor:");
			valorInicial += scan.nextDouble();

		}

		scan.close(); // Fecha leitura de dados
		
		orcamento.setValorInicial(valorInicial);
		valorCalculado = icms.calcular(orcamento.getValorInicial());
		
		System.out.printf("Valor inicial: R$ %.2f\n", valorInicial);
		System.out.printf("Valor calculado ICMS: R$ %.2f", valorCalculado);

	}
}
