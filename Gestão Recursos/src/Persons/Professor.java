package Persons;

public class Professor extends PrivateAcess {
	
	protected Professor(Professor professor) {
		this.setName(professor.getName());
		this.setID(professor.getID());
	}
	public Professor() {}
	@Override
	public PersonPrototype clonar() {
		return new Professor(this);
	}
	
}
