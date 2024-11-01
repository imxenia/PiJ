package ru.vsu.cs.lyshova.objects;

public class Pupil {
    private int id;
    private final String name;
    private final int groupId; // fk
    private final String number;

    public Pupil(String name, int groupId, String number) {
        this.name = name;
        this.groupId = groupId;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return "Имя: " + name + " | ID группы: " + groupId + " | Номер телефона: " + number;
    }
}
