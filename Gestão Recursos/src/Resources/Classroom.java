package Resources;

public class Classroom extends ResourcePrototype {

    protected Classroom(Classroom classroom, int id_ac) {
        this.setID(id_ac + 1);
    }

    public Classroom() {
    }

    @Override
    public ResourcePrototype clonar(int id_ac) {
        return new Classroom(this, id_ac);
    }

    @Override
    public String toString() {
        return "Classroom";
    }
}
