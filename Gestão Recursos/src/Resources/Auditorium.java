package Resources;

public class Auditorium extends ResourcePrototype {

    protected Auditorium(Auditorium auditorium, int id_ac){
        this.setID( id_ac + 1 );
    }
    public Auditorium(){}
    @Override
    public ResourcePrototype clonar(int id_ac) {
        return new Auditorium(this, id_ac);
    }

}
