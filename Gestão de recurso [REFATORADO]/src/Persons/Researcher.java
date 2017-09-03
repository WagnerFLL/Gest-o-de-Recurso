package Persons;

public class Researcher extends PersonPrototype implements PrivateAcess {
	
	protected Researcher(Researcher researcher) {
		this.setName(researcher.getName());
		this.setID(researcher.getID());
	}
	public Researcher(){}
	@Override
	public PersonPrototype clonar() {
		return new Researcher(this);
	}
	
}
