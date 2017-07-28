package system;

import java.util.Scanner;

public class Assalariado extends Funcionario {
	
	Scanner scan = new Scanner(System.in);
	private double salarioFixo;
	private int diaPagameto;
	
	public Assalariado(int ID) {
		super(ID);
		System.out.println("Qual o percentual da comissão?");
		this.salarioFixo = scan.nextDouble();
		this.diaPagameto = 1;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public int getDiaPagameto() {
		return diaPagameto;
	}

	public void setDiaPagameto(int diaPagameto) {
		this.diaPagameto = diaPagameto;
	}
	
	

}
