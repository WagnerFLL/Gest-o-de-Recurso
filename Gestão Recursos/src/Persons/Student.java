package Persons;

public class Student extends PersonPrototype{

	private String grau;
	
	protected Student(Student student) {
		this.setName(student.getName());
		this.setID(student.getID());
	}
	public Student(){}

	@Override
	public void setAtributs(int a) {
		System.out.println("Digite o nome do usuário:");
		this.setName(scanStr.nextLine());
		this.setID(a);
	}

	@Override
	public PersonPrototype clonar() {
		return new Student(this);
	}


}
