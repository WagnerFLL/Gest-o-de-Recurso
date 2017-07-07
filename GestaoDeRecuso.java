package aula_1;

import java.util.Scanner;

public class GestaoDeRecuso {

	public static void main(String[] args) {
		
		System.out.println("Sistema de aloca��o");
		
		Scanner readerInt = new Scanner(System.in);
		Scanner readerStr = new Scanner(System.in);
		
		int[] users = new int[100];
		
		int[] recursoSala = new int[100];
		int[] tipoRecurso = new int[100];
		String[] recursoData = new String[100];
		String[] recursoHoraInicio = new String[100];
		String[] recursoHoraTermino = new String[100];
		String[] recursoResponsavel = new String[100];
		String[] recursoStatus = new String[100];
		
		String[] recursoAtividadeTitulo = new String[100];
		int[] recursoAtividadeTipo = new int[100];
		String[] recursoAtividadeDescricao = new String[100];
		String[] recursoAtividadeMaterial = new String[100];
		
		int option = 0;
		int count = 0;
		while(true) {
			System.out.println("Escolha uma da op��es:\n"
							 + "1 - Aloca��es.\n"
							 + "2 - Consultar recurso.\n"
							 + "3 - Relat�rio acad�mico.\n"
							 + "4 - Administrar aloca��es.\n"
							 + "5 - Consultar usu�rio.\n"
							 + "6 - Consultar recurso.\n"
							 + "7 - Sair.");
			option = readerInt.nextInt();
			
			if(option == 1) {
				
				System.out.println("Qual o tipo de usu�rio?\n"
								 + "1 - Aluno.\n"
								 + "2 - Professor.\n"
								 + "3 - Pesquisador.\n");
				int user_type = readerInt.nextInt();
				
				System.out.println("Qual o recurso?\n"
								 + "1 - Sala.\n"
								 + "2 - Laborat�rio.\n"
								 + "3 - Projetor.\n");
				int type = readerInt.nextInt();
				
				if(user_type == 1 && type !=3) {
					System.out.println("O recurso n�o pode ser alocdo por um aluno.");
					continue;
				}
				else if(user_type != 1 && (type == 1 || type == 2)) {
					System.out.println("Qual a atividade?\n"
							 + "1 - Aula.\n"
							 + "2 - Laborat�rio.\n"
							 + "3 - Apresenta��o.\n");
					recursoAtividadeTipo[count] = readerInt.nextInt();
					tipoRecurso[count] = type;
					users[count] = user_type;
					recursoStatus[count] = "Em andamento";
					System.out.println("Nome do respons�vel:");
					recursoResponsavel[count] = readerStr.nextLine();
					System.out.println("Digite o n�mero da sala/lab que deseja alocar:");
					recursoSala[count] = readerInt.nextInt();
					System.out.println("Digite a hora de in�cio:");
					recursoHoraInicio[count] = readerStr.nextLine();
					System.out.println("Digite a hora de fim:");
					recursoHoraTermino[count] = readerStr.nextLine();
					System.out.println("Titulo da atividade:");
					recursoAtividadeTitulo[count] = readerStr.nextLine();
					System.out.println("Decri��o da atividade:");
					recursoAtividadeDescricao[count] = readerStr.nextLine();
					System.out.println("Material:");
					recursoAtividadeMaterial[count] = readerStr.nextLine();
					System.out.println("Data:");
					recursoData[count] = readerStr.nextLine();
					++count;
					
				}else if(type == 3) {
					
					tipoRecurso[count] = type;
					users[count] = user_type;
					recursoStatus[count] = "Em andamento";
					System.out.println("Nome do respons�vel:");
					recursoResponsavel[count] = readerStr.nextLine();
					System.out.println("Digite o n�mero da projetor que deseja alocar:");
					recursoSala[count] = readerInt.nextInt();
					System.out.println("Digite a hora de in�cio:");
					recursoHoraInicio[count] = readerStr.nextLine();
					System.out.println("Digite a hora de fim:");
					recursoHoraTermino[count] = readerStr.nextLine();
					System.out.println("Titulo da atividade:");
					recursoAtividadeTitulo[count] = readerStr.nextLine();
					System.out.println("Decri��o da atividade:");
					recursoAtividadeDescricao[count] = readerStr.nextLine();
					System.out.println("Material:");
					recursoAtividadeMaterial[count] = readerStr.nextLine();
					System.out.println("Data:");
					recursoData[count] = readerStr.nextLine();
					++count;
				}
			}
			else if(option == 2) {
				System.out.println("Digite o ID do aloca��o:");
				int id = readerInt.nextInt();
				System.out.println(recursoAtividadeTitulo[count]);
				System.out.println("Respons�vel: "+recursoResponsavel[id]);
				System.out.println("Status: "+recursoStatus[id]);
				System.out.println("Data: "+recursoData[id]);
				System.out.println("Decri��o da atividade: "+recursoAtividadeDescricao[id]);
				System.out.println("Digite a hora de in�cio: "+recursoHoraInicio);
				System.out.println("Digite a hora de fim: "+recursoHoraTermino);
			}
			else if(option == 3) {
				
				int aula = 0,lab = 0, apresentacao = 0;
				int concluido = 0, andamento = 0, alocado = 0;
				
				for(int i=0 ; i<count ; i++) {
					
					if(recursoStatus[i].equals("Em andamento"))andamento++;
					else if(recursoStatus[i].equals("Alocado"))alocado++;
					else if(recursoStatus[i].equals("Conclu�do"))concluido++;
					
					if(recursoAtividadeTipo[i] == 1)aula++;
					else if(recursoAtividadeTipo[i] == 2)lab++;
					else if(recursoAtividadeTipo[i] == 3)apresentacao++;
					
				}
				
				System.out.println("N�mero total de aloca��es: "+count);
				System.out.println("N�mero de processos em andamento: "+andamento);
				System.out.println("N�mero de processos conclu�dos: "+concluido);
				System.out.println("N�mero de processos alocados: "+alocado);
				
				System.out.println("Aulas: "+aula);
				System.out.println("AUlas em Laborat�rios: "+lab);
				System.out.println("Apresenta��s: "+apresentacao);
				
			}
			else if(option == 4) {
				System.out.println("Digite o ID do aloca��o:");
				int id = readerInt.nextInt();
				System.out.println("Respons�vel: "+recursoResponsavel[id]);
				System.out.println("Status: "+recursoStatus[id]);
				System.out.println("Data: "+recursoData[id]);
				System.out.println("Decri��o da atividade:"+recursoAtividadeDescricao[id]);
				System.out.println("Digite a hora de in�cio:"+recursoHoraInicio[id]);
				System.out.println("Digite a hora de fim:"+recursoHoraTermino[id]);
				System.out.println("\nDeseja aletrar o status?(y/n)");
				String enter = readerStr.nextLine();
				if(enter.equals("y")) {
					System.out.println("Digite o novo status:");
					recursoStatus[id] = readerStr.nextLine();
				}
			}
			else if(option == 5) {
				System.out.println("Digite o nome do usu�rio a ser consultado:");
				String search = readerStr.nextLine();
				
				boolean find = false;
				
				int i = 0;
				for(i=0 ; i<count ; i++) {
					if(recursoResponsavel[i].equals(search)) {
						find = true;
						System.out.println(recursoAtividadeTitulo[count]);
						System.out.println("Status: "+recursoStatus[i]);
						System.out.println("Data: "+recursoData[i]);
						System.out.println("Decri��o da atividade:"+recursoAtividadeDescricao[i]);
						System.out.println("Hora de in�cio:"+recursoHoraInicio[i]);
						System.out.println("Hora de fim:"+recursoHoraTermino[i]);
						System.out.println("\n-----------------------------------\n");
					}
				}
				
				if(find)System.out.println("Usu�rio n�o encontrado.");
			}
			else if(option == 6) {
				System.out.println("Qual o recurso?\n"
						 + "1 - Sala.\n"
						 + "2 - Laborat�rio.\n"
						 + "3 - Projetor.\n");
				int type = readerInt.nextInt();
				
				boolean find = false;
				
				int i = 0;
				for(i=0 ; i<count ; i++) {
					if(tipoRecurso[i] == type) {
						find = true;
						System.out.println(recursoAtividadeTitulo[count]);
						System.out.println("Respons�vel: "+recursoResponsavel[i]);
						System.out.println("Status: "+recursoStatus[i]);
						System.out.println("Data: "+recursoData[i]);
						System.out.println("Decri��o da atividade:"+recursoAtividadeDescricao[i]);
						System.out.println("Hora de in�cio:"+recursoHoraInicio[i]);
						System.out.println("Hora de fim:"+recursoHoraTermino[i]);
						System.out.println("\n-----------------------------------\n");
					}
				}
				
				if(find)System.out.println("Recurso nunca foi alocado!");
				
			}
			else if(option == 7)
				break;	
		}
		
		readerInt.close();
		readerStr.close();
		
	}

}