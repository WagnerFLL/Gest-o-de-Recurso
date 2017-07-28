package system;

import java.util.Scanner;

public class Comissionado extends Assalariado{
	
	Scanner scan = new Scanner(System.in);
	private int comissaoPercentual;
	
	public Comissionado(int ID) {
		super(ID);
		System.out.println("Digite a comissão percentual:(INTEIRO)");
		this.comissaoPercentual = scan.nextInt();
	}

	public int getComissaoPercentual() {
		return comissaoPercentual;
	}

	public void setComissaoPercentual(int comissaoPercentual) {
		this.comissaoPercentual = comissaoPercentual;
	}
	
}
