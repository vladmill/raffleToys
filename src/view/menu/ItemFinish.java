package view.menu;

import view.View;

public class ItemFinish extends ItemMenu {
    public ItemFinish(View view) {
        super(view);
        super.setDescription("Завершить работу");
    }

    @Override
    public void execute() {
        super.getView().finish();
    }
}
