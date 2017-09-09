package Control;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Frame frame = new Frame();
		
		while(true) {
			System.out.println("\tSelecione uma das opções:\n");
			System.out.println("\t|1| Cadastrar novo usuário.\n" +
							   "\t|2| Alocar recurso.\n" +
					  	 	   "\t|3| Alterar status da alocação.\n" +
                               "\t|4| Adicionar informações de alocações.\n");
			
			int option = scan.nextInt();  
			switch (option){
				case 1:
					frame.addUser();
					break;
				case 2:
					frame.allocation();
					break;
				case 3:
					frame.changeStatus();
					break;
                case 4:
                    frame.addInfo();
                    break;
			}
			
			
		}
	}
	

}
