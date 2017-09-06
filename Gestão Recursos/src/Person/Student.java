package Person;

public class Student extends PersonPrototype{
	
	private String grau;
	
	protected Student(Student student) {
		this.setName(student.getName());
		this.setID(student.getID());
	}
	public Student(){}
	
	@Override
	public PersonPrototype clonar() {
		return new Student(this);
	}


}
