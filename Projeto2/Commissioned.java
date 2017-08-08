package projeto2.folha.pagamento;

import java.util.Scanner;

public class Commissioned extends Salaried{
	
	Scanner scan = new Scanner(System.in);
	private double percentageCommission;
	private double commission;
	
	public Commissioned(int ID) {
		super(ID);
		this.commission = 0;
		System.out.println("Digite a comissão percentual:(Float)");
		this.percentageCommission = scan.nextDouble();
		
	}
	
	@Override
	public double toPay() {
		return super.toPay()+this.commission;
	}

	public void addSale(double sale) {
		this.commission += percentageCommission*sale;
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getPercentageCommission() {
		return percentageCommission;
	}

	public void setPercentageCommission(int percentageCommission) {
		this.percentageCommission = percentageCommission;
	}
	
}
