package Resources;

public class Projector extends ResourcePrototype {

    protected Projector(Projector projector, int id_ac){
        this.setID( id_ac + 1 );
    }
    public Projector(){}
    @Override
    public ResourcePrototype clonar(int id_ac) {
        return new Projector(this, id_ac);
    }

}
