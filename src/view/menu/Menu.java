package view.menu;

import view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ItemMenu> items;
    private View view;

    public Menu(View view) {
        this.view = view;
        this.items = new ArrayList<>();
        this.items.add(new ItemShowToys(view));
        this.items.add(new ItemAddToy(view));
        this.items.add(new ItemEditWT(view));
        this.items.add(new ItemRaffle(view));
        this.items.add(new ItemShowPrizes(view));
        this.items.add(new ItemFinish(view));
    }

    public void execute(int choice) throws IOException, ClassNotFoundException {
        items.get(choice - 1).execute();
    }

    public void printMenu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            sb.append(String.format("%d. %s%n", i + 1, items.get(i).getDescription()));
        }
        sb.append("¬ведите номер команды: ");
        System.out.print(sb);
    }

    public List<ItemMenu> getItems() {
        return items;
    }
}
