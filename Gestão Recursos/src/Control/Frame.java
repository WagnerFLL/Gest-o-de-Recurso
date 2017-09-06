package Control;

import java.util.LinkedList;
import java.util.Scanner;

import Persons.PersonPrototype;
import Persons.Professor;
import Persons.Researcher;
import Persons.Student;

public class Frame {
	
	private LinkedList<PersonPrototype> users;
	private Student studentPrototype = new Student();
	private Professor professorPrototype = new Professor();
	private Researcher reseacherPrototype = new Researcher();
	private int countUser = 0;
	Scanner scan = new Scanner(System.in);
	
	public void addUser() {
		
		System.out.println("Selecione o tipo de usuário:\n"
						 + "1 - Aluno.\n"
						 + "2 - Professor.\n"
						 + "3 - Pesquisador.\n");
		
		int option = scan.nextInt();
		
		switch (option) {
		case 1:
			users.add(studentPrototype.clonar());
			break;
		case 2:
			users.add(professorPrototype.clonar());
			break;
		case 3:
			users.add(reseacherPrototype.clonar());
			break;
		}
		
	}
	
}
