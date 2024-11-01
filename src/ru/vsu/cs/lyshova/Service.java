package ru.vsu.cs.lyshova;

import ru.vsu.cs.lyshova.objects.Group;
import ru.vsu.cs.lyshova.objects.Pupil;

import java.util.Scanner;

public class Service {
    private Controller controller;

    public Service(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Создать группу");
            System.out.println("2 - Создать ученика");
            System.out.println("3 - Показать все группы");
            System.out.println("4 - Показать всех учеников");
            System.out.println("0 - Выход");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    createGroup();
                    break;
                case 2:
                    createPupil();
                    break;
                case 3:
                    displayAllGroups();
                    break;
                case 4:
                    displayAllPupils();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    private void createGroup() {
        int number = scanInteger("Введите номер группы:");

        String direction = scanLine("Введите направление группы:");

        String formEducation = scanLine("Введите форму обучения:");

        controller.addGroup(number, direction, formEducation);

        System.out.println("Группа создана и добавлена в репозиторий!");
    }

    private void createPupil() {
        String name = scanLine("Введите имя ученика:");

        int groupId = scanInteger("Введите ID группы (за ней будет закреплен ученик):");

        String number = scanLine("Введите номер телефона:");

        controller.addPupil(name, groupId, number);

        System.out.println("Ученик создан и добавлен в репозиторий!");
    }

    private void displayAllGroups() {
        System.out.println("Список всех групп:");
        for (Group group : controller.getAllGroup()) {
            System.out.println(group.toString());
        }
        System.out.println();
    }

    private void displayAllPupils() {
        System.out.println("Список всех учеников:");
        for (Pupil pupil : controller.getAllPupils()) {
            System.out.println(pupil.toString());
        }
        System.out.println();
    }

    private String scanLine(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int scanInteger(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
