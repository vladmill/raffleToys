package view.menu;

import view.View;

public class ItemShowToys extends ItemMenu {
    public ItemShowToys(View view) {
        super(view);
        super.setDescription("Список игрушек");
    }

    @Override
    public void execute() {
        super.getView().showToys();
    }
}
