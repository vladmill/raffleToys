package view;

import presenter.Presenter;

import java.io.IOException;

public interface View {
    void setPresenter(Presenter presenter);
    void start() throws IOException;
    void showToys();
    void addToy() throws IOException;
    void editWt() throws IOException;
    void raffle() throws IOException;
    void showPrizes();
    void finish();
}