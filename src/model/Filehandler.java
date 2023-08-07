package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Filehandler {
    private Model model;
    private String fileToyshop = "toys.dat";
    private String filePrize = "prize.dat";


    public Filehandler(Model model) {
        this.model = model;
    }

    public void saveToyshop() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileToyshop));
        objectOutputStream.writeObject(model.getToyshop());
        objectOutputStream.close();
    }

    public Toyshop loadToyshop() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileToyshop));
        Toyshop toyshop = (Toyshop) objectInputStream.readObject();
        objectInputStream.close();
        return toyshop;
    }

    public void savePrize() throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(filePrize);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(model.getPrizeList());
        oos.close();
        fos.close();
    }
    public List<Toy> loadPrize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filePrize);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Toy> prizes = (List) ois.readObject();
        ois.close();
        fis.close();
        return prizes;
    }
}
