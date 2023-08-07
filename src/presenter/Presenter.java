package presenter;

import model.Model;
import model.Toy;
import view.View;

import java.io.IOException;
import java.util.List;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.setPresenter(this);
    }
    public List<Toy> getToys(){
        return model.getToys();

    }

    public void addToy(Toy toy) throws IOException {
        model.addToy(toy);
    }

    public void editWT(String id, int wt) throws IOException {
        model.editWT(id, wt);
    }

    public Toy raffle() throws IOException, ClassNotFoundException {
        return model.raffle();
    }
    public List<Toy> getPrizes() throws IOException, ClassNotFoundException {
        return model.getPrizes();
    }
}
