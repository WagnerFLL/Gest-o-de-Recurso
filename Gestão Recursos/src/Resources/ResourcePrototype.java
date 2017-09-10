package Resources;

import java.util.Calendar;

import Persons.PrivateAcess;

public abstract class ResourcePrototype {

    public abstract ResourcePrototype clonar(int id);

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
