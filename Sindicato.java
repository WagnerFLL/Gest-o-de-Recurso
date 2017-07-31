package system;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sindicato {
	
	Scanner scan = new Scanner(System.in);
	private double taxaSindical;
	private double taxaAdicional;
	
	List<Integer> associados = new LinkedList<Integer>();
	
	public Sindicato() {
		
		System.out.println("Informe a taxa sindical: ");
		this.taxaSindical = scan.nextDouble();
	}
	
	public void adicionarFuncionario() {
		System.out.println("Informe o CPF do funcionário: ");
		associados.add(new Integer(scan.nextInt()));
	}

	public double getTaxaSindical() {
		return taxaSindical;
	}

	public void setTaxaSindical(double taxaSindical) {
		this.taxaSindical = taxaSindical;
	}

	public double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}
	
}
