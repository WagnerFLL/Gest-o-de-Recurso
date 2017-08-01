package projeto2.folha.pagamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Payroll payroll = new Payroll();
		Syndicate syndicate = new Syndicate();

		Scanner scanInt = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		boolean flag = true;

		while(flag) {

			System.out.println("===================================\n"
					+ "|  Selecione uma das opções:\n"
					+ "|\t 1 - Adicionar funcionário.\n"
					+ "|\t 2 - Remover funcionário.\n"
					+ "|\t 3 - Alterar data de pagamento.\n"
					+ "|\t 4 - Alterar dados.\n"
					+ "|\t 5 - Adicionar funcionário ao sindicato.\n"
					+ "|\t 6 - Adicionar venda.\n"
					+ "|\t 7 - Adicionar horas trabalhadas.\n"
					+ "|\t 8 - Ver próximos pagamentos.\n"
					+ "|\t 9 - Próximo dia.\n"
					+ "|\t 10 - Sair.\n");

			int option = scanInt.nextInt();

			switch(option){
			case 1:
				payroll.addEmployee();
				break;
			case 2:
				payroll.removeEmployee();
				break;
			case 3:
				payroll.changePaymentsSchedule();
				break;
			case 4:
				payroll.modifyEmployee();
				break;
			case 5:
				syndicate.addFunctionary();
				break;
			case 6:
				payroll.sale();
				break;
			case 7:
				payroll.addHours();
				break;
			case 8:
				payroll.checkPayments();
			case 9:
				payroll.nextDay();
				break;
			case 10:
				flag = false;
				break;
			default:
				System.out.println("Opção inválida.\n");
			}
		}

		scanInt.close();
		scan2.close();
	}

}
