package Persons;

public abstract class PrivateAcess extends PersonPrototype {

	private int numAllocations = 0;

    public int getNumAllocations() {
        return numAllocations;
    }

    public void setNumAllocations(int numAllocations) {
        this.numAllocations = numAllocations;
    }
}
