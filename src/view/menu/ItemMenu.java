package view.menu;

import view.View;

import java.io.IOException;

public abstract class ItemMenu {
    private View view;
    private String description;

    public ItemMenu(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void execute() throws IOException;
}
