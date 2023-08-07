package view;

import model.Toy;
import presenter.Presenter;
import view.menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class ViewConsole implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public ViewConsole() {
        this.scanner = new Scanner(System.in);
        this.work = true;
        this.menu = new Menu(this);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    private String scan() {
        return scanner.nextLine();
    }

    private boolean checkInt(String text) {
        return text.matches("[0-9]+");
    }

    @Override
    public void start() throws IOException, ClassNotFoundException {
        while (work) {
            menu.printMenu();
            String input = scan();
            if (checkInt(input)) {
                int choice = Integer.parseInt(input);
                if (choice < 1 || choice > menu.getItems().size()) {
                    System.out.println("Введена некорректная команда. Попробуйте еще раз.\n");
                } else {
                    menu.execute(choice);
                }
            } else {
                System.out.println("Введена некорректная команда. Попробуйте еще раз.\n");
            }
        }
    }

    @Override
    public void showToys() {
        for (Toy toy : presenter.getToys()){
            System.out.println(toy);
        }
    }

    @Override
    public void addToy() throws IOException {
        System.out.print("Введите название: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите вероятность (вес): ");
        int wt = Integer.parseInt(scanner.nextLine());
        presenter.addToy(new Toy(name, quantity, wt));
    }

    @Override
    public void editWt() throws IOException {
        System.out.print("id игрушки: ");
        String id = scanner.nextLine();
        System.out.print("Введите вероятность (вес): ");
        int wt = Integer.parseInt(scanner.nextLine());
        presenter.editWT(id, wt);
    }

    @Override
    public void raffle() throws IOException, ClassNotFoundException {
        System.out.println(presenter.raffle());
    }

    @Override
    public void showPrizes() throws IOException, ClassNotFoundException {
        for (Toy toy: presenter.getPrizes()) {
            System.out.println(toy);
        }
    }

    @Override
    public void finish() {
        work = false;
        System.out.println("Работа завершена.");
    }

}
