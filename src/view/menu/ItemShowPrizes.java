package view.menu;

import view.View;

public class ItemShowPrizes extends ItemMenu{
    public ItemShowPrizes(View view) {
        super(view);
        super.setDescription("Список призов");
    }

    @Override
    public void execute() {
        super.getView().showPrizes();
    }
}
