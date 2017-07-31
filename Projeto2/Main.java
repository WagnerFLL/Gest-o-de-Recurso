package system;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FolhaPagamento folha = new FolhaPagamento();

		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {

			System.out.println("===================================\n"
					+ "|  Selecione uma das opções:\n"
					+ "|\t 1 - Adicionar funcionário.\n"
					+ "|\t 2 - Remover funcionário.\n"
					+ "|\t 3 - Próximo dia.\n"
					+ "|\t 4 - Alterar data de pagamento.\n"
					+ "|\t 5 - Alterar dados.\n"
					+ "|\t 6 - Lançar horas trabalhadas.\n"
					+ "|\t 7 - Adicionar sindicato.\n"
					+ "|\t 8 - Adicionar venda.\n"
					+ "|\t 9 - Sair\n");
			int option = scanInt.nextInt();

			switch (option) {
			case 1:
				folha.adicionarEmpregado();
				break;
			case 2:
				folha.removerEmpregado();
				break;
			case 3:
				folha.proximoDia();
				break;
			case 4:
				folha.alterarAgenda();
				break;
			case 5:
				folha.alterarEmpregado();
				break;
			case 6:
				folha.adicionarHoras();
				break;
			case 7:
				Sindicato sindicato = new Sindicato();
			case 8:
				folha.venda();
			case 9:
				flag = false;
				break;
			default:
				System.out.println("Opção inválida.\n");
			}


		}
		
		scanInt.close();
		scanStr.close();
	}

}
