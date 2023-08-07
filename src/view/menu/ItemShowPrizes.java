package view.menu;

import view.View;

import java.io.IOException;

public class ItemShowPrizes extends ItemMenu{
    public ItemShowPrizes(View view) {
        super(view);
        super.setDescription("Список призов");
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        super.getView().showPrizes();
    }
}
