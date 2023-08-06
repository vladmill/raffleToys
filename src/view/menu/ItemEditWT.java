package view.menu;

import view.View;

import java.io.IOException;

public class ItemEditWT extends ItemMenu {
    public ItemEditWT(View view) {
        super(view);
        super.setDescription("Изменить вероятность");
    }

    @Override
    public void execute() throws IOException {
        super.getView().editWt();
    }
}
