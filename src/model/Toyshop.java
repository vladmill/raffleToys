package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Toyshop<T extends Toy> implements Serializable {
    private List<T> toys;

    public Toyshop(ArrayList<T> toys) {
        this.toys = toys;
    }


    public List<T> getToys() {
        return toys;
    }


}
