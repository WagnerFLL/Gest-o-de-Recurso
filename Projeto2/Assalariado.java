package system;

import java.util.Scanner;

public class Assalariado extends Funcionario {
	
	Scanner scan = new Scanner(System.in);
	private double salarioFixo;
	
	public Assalariado(int ID) {
		super(ID);
		System.out.println("Qual o percentual da comissão?");
		this.salarioFixo = scan.nextDouble();
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}	

}
