package Persons;

public abstract class PrivateAcess extends PersonPrototype {

	private int numAllocations = 0;

    public int getNumAllocations() {
        return numAllocations;
    }

    public void setNumAllocations(int numAllocations) {
        this.numAllocations = numAllocations;
    }


    @Override
    public void setAtributs(int a) {
        System.out.println("Digite o nome do usuário:");
        this.setName(scanStr.nextLine());
        this.setID(a);
    }

}
