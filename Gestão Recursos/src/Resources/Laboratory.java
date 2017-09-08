package Resources;

public class Laboratory extends ResourcePrototype {

    protected Laboratory(Laboratory laboratory, int id_ac){
        this.setID( id_ac + 1 );
    }
    public Laboratory(){}
    @Override
    public ResourcePrototype clonar(int id_ac) {
        return new Laboratory(this, id_ac);
    }

}
