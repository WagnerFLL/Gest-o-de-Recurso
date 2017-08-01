package projeto2.folha.pagamento;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Syndicate {
	
	Scanner scan = new Scanner(System.in);
	private double serviceCharge;
	
	List<Integer> associated = new LinkedList<Integer>();
	
	public Syndicate() {
		
		System.out.println("Informe a taxa sindical: ");
		this.serviceCharge = scan.nextDouble();
	}
	
	public void addFunctionary() {
		System.out.println("Informe o CPF do funcionário: ");
		associated.add(new Integer(scan.nextInt()));
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
}
