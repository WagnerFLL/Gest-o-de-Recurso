package system;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FolhaPagamento folha = new FolhaPagamento();

		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {

			System.out.println("===========================\n"
					+ "|  Selecione uma das op��es:\n"
					+ "|\t 1 - Adicionar funcion�rio.\n"
					+ "|\t 2 - Remover funcion�rio.\n"
					+ "|\t 3 - Pr�ximo dia.\n"
					+ "|\t 4 - Sair\n");
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
				flag = false;
				break;
			default:
				System.out.println("Op��o inv�lida.\n");
			}


		}
		
		scanInt.close();
		scanStr.close();
	}

}
