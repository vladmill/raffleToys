package view.menu;

import view.View;

import java.io.IOException;

public class ItemAddToy extends ItemMenu {
    public ItemAddToy(View view) {
        super(view);
        super.setDescription("Добавить игрушку");
    }

    @Override
    public void execute() throws IOException {
        super.getView().addToy();
    }
}
