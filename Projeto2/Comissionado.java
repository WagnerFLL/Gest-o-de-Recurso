package system;

import java.util.Calendar;
import java.util.Scanner;

public class Comissionado extends Assalariado{
	
	Scanner scan = new Scanner(System.in);
	private int comissaoPercentual;
	private Calendar diaPagameto;
	
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

	@SuppressWarnings("static-access")
	public int getDiaPagameto() {
		return diaPagameto.get(diaPagameto.DAY_OF_MONTH);
	}

	public void setDiaPagameto(Calendar diaPagameto) {
		this.diaPagameto = diaPagameto;
	}
	
	
	
}
