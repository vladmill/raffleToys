package model;

import java.io.Serializable;

public class Toy implements Serializable {
    private final String id;
    private final String name;
    private int quantity;
    private int wt;

    private static int counter = 0;

    private static String newID() {
        return String.format("toy000%d", ++counter);
    }

    public Toy(String name, int quantity, int wt) {
        this.id = newID();
        this.name = name;
        this.quantity = quantity;
        this.wt = wt;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWt() {
        return wt;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWt(int wt) {
        this.wt = wt;
    }

    public static void setCounter(int counter) {
        Toy.counter = counter;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Имя: %s, Количество: %d, Вероятность: %d%%", id, name, quantity, wt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;

        Toy toy = (Toy) o;
        if (id != null ? !id.equals(toy.id) : toy.id != null) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
