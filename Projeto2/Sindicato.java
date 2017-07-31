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
		
		System.out.println("Informe a quantidade de associados: ");
		for(int i = scan.nextInt() ; i>0 ; i--) {
			System.out.println("Informe o CPF do associado: ");
			associados.add(new Integer(scan.nextInt()));
		}
	}
	
}
