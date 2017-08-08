package projeto2.folha.pagamento;

import java.util.Scanner;

public class Salaried extends Functionary {
	
	Scanner scan = new Scanner(System.in);
	private double fixedSalary;
	
	public Salaried(int ID) {
		super(ID,30);
		System.out.println("Informe o salário do empregado: (Float)");
		this.fixedSalary = scan.nextDouble();
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public double toPay() {
		return (this.fixedSalary/30)*getIntervalPayments();
	}	

}
