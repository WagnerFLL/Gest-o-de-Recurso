package Control;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Frame frame = new Frame();
        boolean flag = true;

        while (flag) {
            System.out.println("\tSelecione uma das opções:\n");
            System.out.println("\t|1| Cadastrar novo usuário.\n" +
                    "\t|2| Alocar recurso.\n" +
                    "\t|3| Alterar status da alocação.\n" +
                    "\t|4| Adicionar informações de alocações.\n" +
                    "\t|5| Buscar por usuário.\n" +
                    "\t|6| Buscar por recurso.\n" +
                    "\t|7| Relatório.\n" +
                    "\t|8| Sair...\n");

            int option = scan.nextInt();
            switch (option) {
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
                case 5:
                    frame.searchUser();
                    break;
                case 6:
                    frame.searchResource();
                    break;
                case 7:
                    frame.report();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        }
    }


}
