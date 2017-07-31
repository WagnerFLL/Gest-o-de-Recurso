package system;

import java.util.Scanner;

public class Assalariado extends Funcionario {
	
	Scanner scan = new Scanner(System.in);
	private double salarioFixo;
	
	public Assalariado(int ID) {
		super(ID,30);
		System.out.println("Informe o salário do empregado:");
		this.salarioFixo = scan.nextDouble();
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}	

}
