package Persons;

import java.util.Scanner;

public abstract class PersonPrototype extends PersonStrategy{
	
	public abstract PersonPrototype clonar();
	public Scanner scanInt = new Scanner(System.in);
	public Scanner scanStr = new Scanner(System.in);
	
}
