package view;

import presenter.Presenter;

import java.io.IOException;

public interface View {
    void setPresenter(Presenter presenter);
    void start() throws IOException, ClassNotFoundException;
    void showToys();
    void addToy() throws IOException;
    void editWt() throws IOException;
    void raffle() throws IOException, ClassNotFoundException;
    void showPrizes() throws IOException, ClassNotFoundException;
    void finish();
}