package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    private Filehandler fh;
    private Toyshop<Toy> toyshop;
    private Random random = new Random();
    private List<Toy> prizeList;


    public Model() throws IOException, ClassNotFoundException {
        this.fh = new Filehandler(this);
        //this.toyshop = new Toyshop<>(new ArrayList<>());
        this.toyshop = fh.loadToyshop() != null ? fh.loadToyshop() : new Toyshop<>(new ArrayList<>());
        Toy.setCounter(this.toyshop.getToys().size());
        this.prizeList = new ArrayList<>();

    }

    public Toyshop<Toy> getToyshop() {
        return toyshop;
    }

    public List<Toy> getPrizeList() {
        return prizeList;
    }

    public List<Toy> getToys() {
        return getToyshop().getToys();
    }

    public void addToy(Toy toy) throws IOException {
        toyshop.getToys().add(toy);
        fh.saveToyshop();
    }
    public Toy findToy(String id){
        for (Toy toy : toyshop.getToys()) {
                if (toy.getId().equals(id)) {
                    return toy;
                }
        }
        return null;
    }
    public void editWT(String id, int wt) throws IOException {
        findToy(id).setWt(wt);
        fh.saveToyshop();
    }

    public Toy raffle () throws IOException, ClassNotFoundException {
            int totalWT = 0;
            for (Toy toy : getToys()) {
                totalWT += toy.getWt();
            }
            int randomWeight = (int) (random.nextDouble() * totalWT);
            int sumWT = 0;
            for (Toy toy : getToys()) {
                sumWT += toy.getWt();
                if (randomWeight <= sumWT) {
                    prizeList.add(toy);
                    fh.savePrize();
                    toy.setQuantity(toy.getQuantity() - 1);
                    fh.saveToyshop();
                    return toy;
                }
            }
            return null;
    }
    public List<Toy> getPrizes() throws IOException, ClassNotFoundException {
        return fh.loadPrize();
    }
}
