import model.Model;
import model.Toy;
import presenter.Presenter;
import view.View;
import view.ViewConsole;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new ViewConsole();
        Model model = new Model();
        new Presenter(view, model);
        view.start();
    }
}