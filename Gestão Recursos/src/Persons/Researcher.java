package Persons;

public class Researcher extends PrivateAcess{
	
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
