package projeto2.folha.pagamento;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Payroll {

	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in); 
	private Calendar calendar = Calendar.getInstance();
	private int nEmployees;
	private List<Commissioned> commissionedList = new LinkedList<Commissioned>();
	private List<Salaried> salariedList = new LinkedList<Salaried>();
	private List<Hourly> hourlyList = new LinkedList<Hourly>();

	public Payroll() {
		this.nEmployees = 0;
	}
	
	public void addEmployee() {
		System.out.println("Qual o tipo de empregado?\n"
				+ "1 - Assalariado.\n"
				+ "2 - Comissionado.\n"
				+ "3 - Horista.\n");
		int option = scanInt.nextInt();

		switch (option) {
		case 1:
			this.salariedList.add(new Salaried(++nEmployees));
			System.out.println(salariedList.get(salariedList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		case 2:
			this.commissionedList.add(new Commissioned(++nEmployees));
			System.out.println(commissionedList.get(commissionedList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		case 3:
			this.hourlyList.add(new Hourly(++nEmployees));
			System.out.println(hourlyList.get(hourlyList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}
	public void removeEmployee() {
		System.out.println("Informe o ID do funcionário: ");

		boolean flag = false;
		int id = scanInt.nextInt();

		for(Salaried funcionario : salariedList) {
			if(funcionario.getID() == id) {
				int index = salariedList.indexOf(funcionario);
				salariedList.remove(index);
				flag = true;
				break;
			}
		}

		if(!flag) {

			for(Commissioned funcionario : commissionedList) {
				if(funcionario.getID() == id) {
					int index = commissionedList.indexOf(funcionario);
					commissionedList.remove(index);
					flag = true;
					break;
				}
			}

		}

		if(!flag) {

			for(Hourly funcionario : hourlyList) {
				if(funcionario.getID() == id) {
					int index = hourlyList.indexOf(funcionario);
					hourlyList.remove(index);
					flag = true;
					break;
				}
			}

		}


	}
	public void modifyEmployee() {

		System.out.println("Informe o ID do funcionário: ");

		int index = 0;
		boolean flag = false;
		int type = 0;
		int id = scanInt.nextInt();

		for(Salaried funcionario : salariedList) {
			if(funcionario.getID() == id) {
				index = salariedList.indexOf(funcionario);
				type = 1;
				flag = true;
				break;
			}
		}

		if(!flag) {

			for(Commissioned funcionario : commissionedList) {
				if(funcionario.getID() == id) {
					index = commissionedList.indexOf(funcionario);
					type = 2;					
					flag = true;
					break;
				}
			}

		}

		if(!flag) {

			for(Hourly funcionario : hourlyList) {
				if(funcionario.getID() == id) {
					index = hourlyList.indexOf(funcionario);
					type = 3;
					flag = true;
					break;
				}
			}
		}

		System.out.println("O que deseja alterar?\n"
				+ "1 - Nome.\n"
				+ "2 - CPF.\n"
				+ "3 - Endreço.\n");
		int option = scanInt.nextInt();

		switch(type) {
		case 1:
			Salaried funcionario = salariedList.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario.setName(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario.setAdress(scanStr.nextLine());
			}
			break;
		case 2:
			Commissioned funcionario1 = commissionedList.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario1.setName(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario1.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario1.setAdress(scanStr.nextLine());
			}
			break;
		case 3:
			Hourly funcionario2 = hourlyList.get(index);
			if(option == 1) {
				System.out.println("Informe o novo nome: ");
				funcionario2.setName(scanStr.nextLine());
			}else if(option == 2) {
				System.out.println("Informe o CPF: ");
				funcionario2.setCpf(scanInt.nextInt());
			}else if(option == 3) {
				System.out.println("Informe o novo endereço: ");
				funcionario2.setAdress(scanStr.nextLine());
			}
			break;
		default:
			System.out.println("ID inexistente!");
			break;
		}

	}
	public void payments() {
		
		for(Salaried func : salariedList){
		
			if(calendar.get(Calendar.DAY_OF_MONTH) == func.getDatePayment().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+func.getFixedSalary()+" à "+func.getName());
				func.nextPayment();
			}
		}

		for(Commissioned func : commissionedList){
			
			if(calendar.get(Calendar.DAY_OF_MONTH) == func.getDatePayment().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+func.getFixedSalary()+" à "+func.getName());
				func.nextPayment();
			}
		}

		for(Hourly func : hourlyList){
			
			if(calendar.get(Calendar.DAY_OF_MONTH) == func.getDatePayment().get(Calendar.DAY_OF_MONTH)){
				System.out.println("Pagamento de "+func.toPay()+" à "+func.getName());
				func.nextPayment();
			}
		}
	}
	
	private void print(){
		System.out.println("Escolha:\n"
				+ "1 - 1º dia do mês.\n"
				+ "2 - Último dia do mês.\n"
				+ "3 - 1º dia da semana.\n"
				+ "4 - No meio do mês.");
	}
	
	public void changePaymentsSchedule() {

		System.out.println("Informe o ID do funcionário: ");
		int id = scanInt.nextInt();
		boolean flag = false;
		boolean choice = false;
		
		System.out.println("Deseja alterar para opções pré-definidas? (y/n)");
		if("y".equals(scanStr.nextLine())) choice = true;
		
		
		for(Salaried func : salariedList){
			if(id == func.getID()){
				flag = true;
				
				if(choice){
					print();
					id = scanInt.nextInt();
					if(id == 1)func.setDatePayment(1,30);
					else if(id == 2)func.setDatePayment(30,30);
					else if(id == 3)func.setDatePayment(1,7);
					else if(id == 4)func.setDatePayment(15,30);
				}else{
					System.out.println("Informe a nova data para pagamento: (Dia)");
					int dia = scanInt.nextInt();
					System.out.println("Informe o intervalo entre os pagamentos: ");
					func.setDatePayment(dia,scanInt.nextInt());
				}
				break;
			}
		}

		if(!flag) {
			
			for(Commissioned func : commissionedList){
				if(id == func.getID()){
					flag = true;
					
					if(choice){
						print();
						id = scanInt.nextInt();
						if(id == 1)func.setDatePayment(1,30);
						else if(id == 2)func.setDatePayment(30,30);
						else if(id == 3)func.setDatePayment(1,7);
						else if(id == 4)func.setDatePayment(15,30);
					}else{
						System.out.println("Informe a nova data para pagamento: (Dia)");
						int dia = scanInt.nextInt();
						System.out.println("Informe o intervalo entre os pagamentos: ");
						func.setDatePayment(dia,scanInt.nextInt());
					}
					break;
				}
			}
		}
		if(!flag) {
			for(Hourly func : hourlyList){
				if(id == func.getID()){
					flag = true;
					
					if(choice){
						print();
						id = scanInt.nextInt();
						if(id == 1)func.setDatePayment(1,30);
						else if(id == 2)func.setDatePayment(30,30);
						else if(id == 3)func.setDatePayment(1,7);
						else if(id == 4)func.setDatePayment(15,30);
					}else{
						System.out.println("Informe a nova data para pagamento: (Dia)");
						int dia = scanInt.nextInt();
						System.out.println("Informe o intervalo entre os pagamentos: ");
						func.setDatePayment(dia,scanInt.nextInt());
					}
					break;
				}
			}
		}
		if(!flag)System.out.println("ID incorreto!");
	}
	public void nextDay() {
		System.out.println("Data atual: "+calendar.get(Calendar.DAY_OF_MONTH)+"/"+(calendar.get(Calendar.MONTH)+1)+"");
		this.payments();
		this.calendar.add(Calendar.DAY_OF_MONTH, 1);
	}
	public void addHours() {
		System.out.println("Informe o id do funcionário: ");
		int id = scanInt.nextInt();
		boolean flag = false;

		if(!flag) {
			for(Hourly func : hourlyList){
				if(id == func.getID()){
					flag = true;
					System.out.println("Informe a quantidade de horas: (int)");
					func.addHours(scanInt.nextInt());
					break;
				}
			}
		}
		if(!flag)System.out.println("ID incorreto ou o funcionário não é horista!");
	}
	public void sale() {
		
		System.out.println("Informe o ID do vendedor: ");
		
		int id = scanInt.nextInt();
		boolean flag = false;
		
		for(Commissioned func : commissionedList){
			if(id == func.getID()){
				flag = true;
				System.out.println("Informe o valor da venda: ");
				func.addSale(scanInt.nextDouble());
				break;
			}
		}
		if(!flag)System.out.println("O funcionário não existe ou não é comissionado!");
	}
	public void checkPayments() {
		
		System.out.println("\n\t... Assalariados ...");
		System.out.println("Funcionários  |   Dia do pagamento");
		if(salariedList.isEmpty())System.out.println("Nenhum funcionário deste tipo.");
		for(Salaried func : salariedList){
			System.out.println(func.getName()+": "+ func.getDatePayment().get(Calendar.DAY_OF_MONTH));
		}

		System.out.println("\n\t... Comissionados ...");
		System.out.println("Funcionários  |   Dia do pagamento");
		if(commissionedList.isEmpty())System.out.println("Nenhum funcionário deste tipo.");
		for(Commissioned func : commissionedList){
			System.out.println(func.getName()+": "+ func.getDatePayment().get(Calendar.DAY_OF_MONTH));
		}

		System.out.println("\n\t... Horistas ...");
		System.out.println("Funcionários  |   Dia do pagamento");
		if(hourlyList.isEmpty())System.out.println("Nenhum funcionário deste tipo.");
		for(Hourly func : hourlyList){
			System.out.println(func.getName()+": "+ func.getDatePayment().get(Calendar.DAY_OF_MONTH));
		}
	}
}
