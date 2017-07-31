package system;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamento {

	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	private double IMPOSTO = 12.3; 
	private Calendar calendario = Calendar.getInstance();
	private int numeroEmpregados;
	private List<Comissionado> funcionariosComissionados = new LinkedList<Comissionado>();
	private List<Assalariado> funcionariosAssalariados = new LinkedList<Assalariado>();
	private List<Horista> funcionariosHoristas = new LinkedList<Horista>();

	public FolhaPagamento() {
		this.numeroEmpregados = 0;
	}

	public void adicionarEmpregado() {
		System.out.println("Qual o tipo de empregado?\n"
				+ "1 - Assalariado.\n"
				+ "2 - Comissionado.\n"
				+ "3 - Horista.\n");
		int option = scanInt.nextInt();

		switch (option) {
		case 1:
			this.funcionariosAssalariados.add(new Assalariado(++numeroEmpregados));
			System.out.println(funcionariosAssalariados.get(funcionariosAssalariados.size()-1).getNome()+" adicionado.");
			break;
		case 2:
			this.funcionariosComissionados.add(new Comissionado(++numeroEmpregados));
			System.out.println(funcionariosComissionados.get(funcionariosComissionados.size()-1).getNome()+" adicionado.");
			break;
		case 3:
			this.funcionariosHoristas.add(new Horista(++numeroEmpregados));
			System.out.println(funcionariosHoristas.get(funcionariosHoristas.size()-1).getNome()+" adicionado.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

	public void removerEmpregado() {
		System.out.println("Informe o ID do funcionário:");

		boolean flag = false;
		int id = scanInt.nextInt();

		for(Assalariado funcionario : funcionariosAssalariados) {
			if(funcionario.getID() == id) {
				int index = funcionariosAssalariados.indexOf(funcionario);
				funcionariosAssalariados.remove(index);
				flag = true;
				break;
			}
		}

		if(!flag) {

			for(Comissionado funcionario : funcionariosComissionados) {
				if(funcionario.getID() == id) {
					int index = funcionariosComissionados.indexOf(funcionario);
					funcionariosComissionados.remove(index);
					flag = true;
					break;
				}
			}

		}

		if(!flag) {

			for(Horista funcionario : funcionariosHoristas) {
				if(funcionario.getID() == id) {
					int index = funcionariosHoristas.indexOf(funcionario);
					funcionariosHoristas.remove(index);
					flag = true;
					break;
				}
			}

		}


	}
	public void alterarEmpregado() {

		System.out.println("Informe o ID do funcionário: ");

		int index = 0;
		boolean flag = false;
		int type = 0;
		int id = scanInt.nextInt();

		for(Assalariado funcionario : funcionariosAssalariados) {
			if(funcionario.getID() == id) {
				index = funcionariosAssalariados.indexOf(funcionario);
				type = 1;
				flag = true;
				break;
			}
		}

		if(!flag) {

			for(Comissionado funcionario : funcionariosComissionados) {
				if(funcionario.getID() == id) {
					index = funcionariosComissionados.indexOf(funcionario);
					type = 2;					
					flag = true;
					break;
				}
			}

		}

		if(!flag) {

			for(Horista funcionario : funcionariosHoristas) {
				if(funcionario.getID() == id) {
					index = funcionariosHoristas.indexOf(funcionario);
					type = 3;
					flag = true;
					break;
				}
			}
		}

		System.out.println("O que deseja alterar?\n"
				+ "1 - Nome.\n"
				+ "2 - CPF.\n"
				+ "3 - Endreço.\n"
				+ "4 - "
				+ "");
		int option = scanInt.nextInt();

		switch(type) {
		case 1:
			Assalariado funcionario = funcionariosAssalariados.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario.setNome(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario.setEndereco(scanStr.nextLine());
			}
			break;
		case 2:
			Comissionado funcionario1 = funcionariosComissionados.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario1.setNome(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario1.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario1.setEndereco(scanStr.nextLine());
			}
			break;
		case 3:
			Horista funcionario2 = funcionariosHoristas.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario2.setNome(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario2.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario2.setEndereco(scanStr.nextLine());
			}
			break;
		default:
			System.out.println("ID inexistente!");
			break;
		}

	}
	public void taxaServico() {

		System.out.println("Informe o ID do funcionário: ");
		int id = scanInt.nextInt();
		boolean flag = false;

		for(Assalariado func : funcionariosAssalariados){
			if(id == func.getID()){
				flag = true;
				System.out.println("Informe a nova taxa: ");
				func.setTaxaServicoSindical(scanInt.nextDouble());
				break;
			}
		}

		if(!flag) {
			for(Comissionado func : funcionariosComissionados){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a nova taxa: ");
					func.setTaxaServicoSindical(scanInt.nextDouble());
					break;
				}
			}
		}
		if(!flag) {
			for(Horista func : funcionariosHoristas){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a nova taxa: ");
					func.setTaxaServicoSindical(scanInt.nextDouble());
					break;
				}
			}
		}
		if(!flag)System.out.println("ID incorreto!");

	}
	public void pagamentos() {
		for(Assalariado func : funcionariosAssalariados){
			System.out.println("Funcionário "+func.getNome()+": "+ func.getPagamento().get(Calendar.DAY_OF_MONTH));
			if(calendario.get(Calendar.DAY_OF_MONTH) == func.getPagamento().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+(func.getSalarioFixo()-IMPOSTO - func.getTaxaServico())+" à "+func.getNome());
				func.proximoPagamento();
			}
		}

		for(Comissionado func : funcionariosComissionados){
			System.out.println("Funcionário "+func.getNome()+": "+ func.getPagamento().get(Calendar.DAY_OF_MONTH));
			if(calendario.get(Calendar.DAY_OF_MONTH) == func.getPagamento().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+(func.getSalarioFixo()-IMPOSTO - func.getTaxaServico())+" à "+func.getNome());
				func.proximoPagamento();
			}
		}

		for(Horista func : funcionariosHoristas){
			System.out.println("Funcionário "+func.getNome()+": "+ func.getPagamento().get(Calendar.DAY_OF_MONTH));
			if(calendario.get(Calendar.DAY_OF_MONTH) == func.getPagamento().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+(func.pagar()-IMPOSTO)+" à "+func.getNome());
				func.proximoPagamento();
			}
		}
	}
	public void alterarAgenda() {

		System.out.println("Informe o ID do funcionário: ");
		int id = scanInt.nextInt();
		boolean flag = false;

		for(Assalariado func : funcionariosAssalariados){
			if(id == func.getID()){
				flag = true;
				System.out.println("Informe a nova data para pagamento: ");
				int dia = scanInt.nextInt();
				System.out.println("Informe o intervalo entre os pagamentos: ");
				func.setPagamento(dia,scanInt.nextInt());
				break;
			}
		}

		if(!flag) {
			for(Comissionado func : funcionariosComissionados){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a nova data para pagamento: ");
					int dia = scanInt.nextInt();
					System.out.println("Informe o intervalo entre os pagamentos: ");
					func.setPagamento(dia,scanInt.nextInt());
					break;
				}
			}
		}
		if(!flag) {
			for(Horista func : funcionariosHoristas){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a nova data para pagamento: ");
					int dia = scanInt.nextInt();
					System.out.println("Informe o intervalo entre os pagamentos: ");
					func.setPagamento(dia,scanInt.nextInt());
					break;
				}
			}
		}
		if(!flag)System.out.println("ID incorreto!");
	}
	public void proximoDia() {
		System.out.println("Data atual: "+calendario.get(Calendar.DAY_OF_MONTH)+"/"+(calendario.get(Calendar.MONTH)+1)+"");
		this.pagamentos();
		this.calendario.add(Calendar.DAY_OF_MONTH, 1);
	}
	public void adicionarHoras() {
		System.out.println("Informe o id do funcionário: ");
		int id = scanInt.nextInt();
		boolean flag = false;

		if(!flag) {
			for(Horista func : funcionariosHoristas){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a quantidade de horas: ");
					func.addHoras(scanInt.nextInt());
					break;
				}
			}
		}
		if(!flag)System.out.println("ID incorreto ou o funcionário não é horista!");
	}
	public void venda() {
		System.out.println("Informe o ID do vendedor: ");
		
		int id = scanInt.nextInt();
		boolean flag = false;
		
		for(Comissionado func : funcionariosComissionados){
			if(id == func.getID()){
				flag = true;
				System.out.println("Informe o valor da venda: ");
				func.adicionarVenda(scanInt.nextDouble());
				break;
			}
		}
		if(!flag)System.out.println("O funcionário não existe ou não é comissionado!");
	}
}
