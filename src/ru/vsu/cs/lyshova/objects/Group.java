package ru.vsu.cs.lyshova.objects;

public class Group {
    private int id;
    private final int number;
    private final String direction;
    private final String formEducation;

    public Group(int number, String direction, String formEducation) {
        this.number = number;
        this.direction = direction;
        this.formEducation = formEducation;
    }

    public int getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public String getFormEducation() {
        return formEducation;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Номер группы: " + Integer.toString(number) + " | Направление: " +
                direction + " | Форма обучения: " + formEducation;
    }
}
