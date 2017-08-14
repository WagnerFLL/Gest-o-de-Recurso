package projeto2.folha.pagamento;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Functionary {
	
	Scanner scanInnt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	private int cpf;
	private int ID;
	private String adress;
	private String name;
	private String formPayment;
	private Calendar datePayment = Calendar.getInstance();;
	private int intervalPayments; 
	
	public Functionary(int ID, int intervalPayments) {
		
		this.ID = ID;
		
		this.intervalPayments = intervalPayments;
		
		datePayment.add(Calendar.DAY_OF_MONTH, this.intervalPayments);
		
		try {
			
			System.out.println("Digite o nome do empregado: ");
			this.name = scanStr.nextLine();
			System.out.println("Digite seu CPF: (Int)");
			this.cpf = scanInnt.nextInt();
			System.out.println("Digite seu endere�o: ");
			this.adress = scanStr.nextLine();
			
			System.out.println("Qual a forma de pagamento?\n"
					+ "1 - Cheque.\n"
					+ "2 - Dep�sito banc�rio.\n"
					+ "3 - Em m�os.\n");
			int option = scanInnt.nextInt();
			
			switch(option) {
			case 1:
				this.formPayment = "Cheque";
				break;
			case 2:
				this.formPayment = "Dep�sito banc�rio";
				break;
			case 3:
				this.formPayment = "Em m�os.";
				break;
			default:
				System.out.println("Op��o inv�lida. Dep�sito banc�rio foi selecionado.");
				this.formPayment = "Dep�sito banc�rio";
				break;
			}
			
		} catch( NumberFormatException e ) {
			
			e.printStackTrace();
			this.formPayment = "Cheque";
			
		} catch( Exception e ) {
			
			e.printStackTrace();
			
		}
	}
	
	@SuppressWarnings("static-access")
	public void nextPayment() {
		this.datePayment.add(datePayment.DAY_OF_MONTH, this.intervalPayments);
	}
	
	public abstract double toPay();
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormPayment() {
		return formPayment;
	}

	public void setFormPayment(String formPayment) {
		this.formPayment = formPayment;
	}

	public Calendar getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(int date, int intervalPayments) {
		this.datePayment.set(Calendar.YEAR, Calendar.MONTH, date);
		this.intervalPayments = intervalPayments;
	}

	public int getIntervalPayments() {
		return intervalPayments;
	}

	public void setIntervalPayments(int intervalPayments) {
		this.intervalPayments = intervalPayments;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return Integer.toString(cpf);
	}
	
}
