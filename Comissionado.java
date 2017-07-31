package system;

import java.util.Scanner;

public class Comissionado extends Assalariado{
	
	Scanner scan = new Scanner(System.in);
	private double comissaoPercentual;
	private double comissoes;
	
	public Comissionado(int ID) {
		super(ID);
		this.comissoes = 0;
		System.out.println("Digite a comissão percentual:(Float)");
		this.comissaoPercentual = scan.nextDouble();
		
	}
	
	public void adicionarVenda(double venda) {
		this.comissoes += comissaoPercentual*venda;
	}
	
	public double getComissoes() {
		return comissoes;
	}

	public void setComissoes(double comissoes) {
		this.comissoes = comissoes;
	}

	public double getComissaoPercentual() {
		return comissaoPercentual;
	}

	public void setComissaoPercentual(int comissaoPercentual) {
		this.comissaoPercentual = comissaoPercentual;
	}
	
}
