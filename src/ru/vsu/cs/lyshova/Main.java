package ru.vsu.cs.lyshova;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Service service = new Service(controller);
        service.start();
    }
}
