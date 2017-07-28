package system;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamento {
	
	Scanner scan = new Scanner(System.in);
	private double IMPOSTO = 12.3; 
	private Calendar caledario;
	private int numeroEmpregados;
	private List<Comissionado> funcionariosComissionados = new LinkedList<Comissionado>();
	private List<Assalariado> funcionariosAssalariados = new LinkedList<Assalariado>();
	private List<Horista> funcionariosHoristas = new LinkedList<Horista>();
	
	public FolhaPagamento() {
		this.numeroEmpregados = 0;
		System.out.println("Digite a data atual.\nAno:");
		int year = scan.nextInt();
		System.out.println("Mês: ");
		int month = scan.nextInt();
		System.out.println("Dia: ");
		int date = scan.nextInt();
		this.caledario.set(year, month, date);
	}
	
	public void adicionarEmpregado() {
		System.out.println("Qual o tipo de empregado?\n"
				+ "1 - Assalariado.\n"
				+ "2 - Comissionado.\n"
				+ "3 - Horista.\n");
		int option = scan.nextInt();
		
		switch (option) {
		case 1:
			this.funcionariosAssalariados.add(new Assalariado(++numeroEmpregados));
			break;
		case 2:
			this.funcionariosComissionados.add(new Comissionado(++numeroEmpregados));
			break;
		case 3:
			this.funcionariosHoristas.add(new Horista(++numeroEmpregados));
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		
	}
	public void removerEmpregado() {
		System.out.println("Informe o ID do funcionário:");
		boolean flag = false;
		int id = scan.nextInt();
		
		for(Assalariado funcionario : funcionariosAssalariados) {
			if(funcionario.getID() == id) {
				int index = funcionariosAssalariados.indexOf(funcionario);
				funcionariosAssalariados.remove(index);
				flag = true;
			}
		}
		
		if(!flag) {
			
			for(Comissionado funcionario : funcionariosComissionados) {
				if(funcionario.getID() == id) {
					int index = funcionariosComissionados.indexOf(funcionario);
					funcionariosComissionados.remove(index);
					flag = true;
				}
			}
			
		}
		
		if(!flag) {
			
			for(Horista funcionario : funcionariosHoristas) {
				if(funcionario.getID() == id) {
					int index = funcionariosHoristas.indexOf(funcionario);
					funcionariosHoristas.remove(index);
					flag = true;
				}
			}
			
		}
		
		
	}
	public void alterarEmpregado() {
		
	}
	public void taxaServico() {
		
	}
	public void pagamentos() {
		
	}
	public void alterarAgenda() {
		
	}
	public void proximoDia() {
		this.caledario.add(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
	}
	
}
