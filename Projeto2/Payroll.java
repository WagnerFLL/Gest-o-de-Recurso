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
	private LinkedList<Functionary> functionaryList = new LinkedList<Functionary>();
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
			this.functionaryList.add(new Salaried(++nEmployees));
			System.out.println(functionaryList.get(functionaryList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		case 2:
			this.functionaryList.add(new Commissioned(++nEmployees));
			System.out.println(functionaryList.get(functionaryList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		case 3:
			this.functionaryList.add(new Hourly(++nEmployees));
			System.out.println(functionaryList.get(functionaryList.size()-1).getName()+" adicionado. ID = "+(nEmployees));
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}

	}
	
	public void removeEmployee() {
		System.out.println("Informe o ID do funcion�rio: ");

		boolean flag = false;
		int id = scanInt.nextInt();
		
		for(Functionary func : functionaryList){
			if(func.getID() == id){
				System.out.println("Funcion�rio "+func.getName()+" removido.");
				functionaryList.remove(func);
				flag = true;
				break;
			}
		}
		
		if(!flag) System.out.println("Funcon�rio inv�lido.");
		
	}
	
	public void modifyEmployee() {

		System.out.println("Informe o ID do funcion�rio: ");
		int id = scanInt.nextInt();
		
		Functionary funcionario = null;
		
		for(Functionary func : functionaryList){
			if(func.getID() == id){
				funcionario = func;
				break;
			}
		}
		
		System.out.println("O que deseja alterar?\n"
				+ "1 - Nome.\n"
				+ "2 - CPF.\n"
				+ "3 - Endre�o.\n");
		int option = scanInt.nextInt();

		if(funcionario == null){
			System.out.println("ID incorreto.");
		}
		else if(option == 1) {
			System.out.println("Informe o novo nome: ");
			funcionario.setName(scanStr.nextLine());
		}else if(option == 2) {
			System.out.println("Informe o CPF: ");
			funcionario.setCpf(scanInt.nextInt());
		}else if(option == 3) {
			System.out.println("Informe o novo endere�o: ");
			funcionario.setAdress(scanStr.nextLine());
		}
		
		

	}
	
	public void payments() {
		
		for(Functionary func : functionaryList){
			
			if(calendar.get(Calendar.DAY_OF_MONTH) == func.getDatePayment().get(Calendar.DAY_OF_MONTH)){
				
				System.out.println( "Pagamento de " + func.toPay() + " feito � " + func.getName());
				func.nextPayment();
				
			}
			
		}
	}
	
	private void print(){
		System.out.println("Escolha:\n"
				+ "1 - 1� dia do m�s.\n"
				+ "2 - �ltimo dia do m�s.\n"
				+ "3 - 1� dia da semana.\n"
				+ "4 - No meio do m�s.");
	}
	
	public void changePaymentsSchedule() {

		System.out.println("Informe o ID do funcion�rio: ");
		int id = scanInt.nextInt();
		boolean flag = false;
		boolean choice = false;
		
		System.out.println("Deseja alterar para op��es pr�-definidas? (y/n)");
		if("y".equals(scanStr.nextLine())) choice = true;
		
		
		for(Functionary func : functionaryList){
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

		if(!flag)System.out.println("ID incorreto!");
	}
	
	public void nextDay() {
	
		System.out.println("Data atual: "+calendar.get(Calendar.DAY_OF_MONTH)+"/"+(calendar.get(Calendar.MONTH)+1)+"");
	
		this.payments();
		this.calendar.add(Calendar.DAY_OF_MONTH, 1);
	
	}
	
	public void addHours() {
		
		System.out.println("Informe o id do funcion�rio: ");
		int id = scanInt.nextInt();
		boolean flag = false;
		
		Functionary func = null;
		
			for(int i = 0 ; i<functionaryList.size() ; i++){
				func =  functionaryList.get(i);	
				
				if(id == func.getID()){
					flag = true;
					
					if(functionaryList.get(i) instanceof Hourly){
						Hourly L = (Hourly) functionaryList.get(i);
						System.out.println("Informe a quantidade de horas: (int)");
						L.addHours(scanInt.nextInt());
					
					}else{
						System.out.println("O funcion�rio n�o � um horista.");
					}
					break;
				}
			}
			
			if(!flag)System.out.println("ID desconhecido.");
		
	}
	
	public void sale() {
		
		System.out.println("Informe o ID do vendedor: ");
		
		int id = scanInt.nextInt();
		boolean flag = false;
		
		Functionary func = null;
		
		for(int i = 0 ; i<functionaryList.size() ; i++){
			func =  functionaryList.get(i);	
			
			if(id == func.getID()){
				flag = true;
				
				if(functionaryList.get(i) instanceof Commissioned){
					Commissioned L = (Commissioned) functionaryList.get(i);
					System.out.println("Informe o valor da venda: ");
					L.addSale(scanInt.nextDouble());
				
				}else{
					System.out.println("O funcion�rio n�o � comissionado.");
				}
				break;
			}
		}
		
		if(!flag)System.out.println("ID desconhecido.");
		
	}
	
	public void checkPayments() {
		
		System.out.println("Funcion�rios:\n");
		for(Functionary func : functionaryList){
			
			System.out.println( func.getName() + " | Pagamento: " + func.getDatePayment().get(Calendar.DAY_OF_MONTH));
			
		}
	}
}
