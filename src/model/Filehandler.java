package model;

import java.io.*;
import java.util.ArrayList;


public class Filehandler {
    private Model model;
    private String filename = "toys.dat";

    public Filehandler(Model model) {
        this.model = model;
    }

    public void saveToyshop() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(model.getToyshop());
        objectOutputStream.close();
    }

    public Toyshop loadToyshop() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        Toyshop toyshop = (Toyshop) objectInputStream.readObject();
        objectInputStream.close();
        return toyshop;
    }
}
