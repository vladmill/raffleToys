package view.menu;

import view.View;

import java.io.IOException;

public class ItemRaffle extends ItemMenu{
    public ItemRaffle(View view) {
        super(view);
        super.setDescription("Розыгрыш игрушки");
    }

    @Override
    public void execute() throws IOException {
        super.getView().raffle();
    }
}
