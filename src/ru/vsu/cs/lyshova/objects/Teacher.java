package ru.vsu.cs.lyshova.objects;

public class Teacher {
    private int id;
    private final String name;
    private int experience;
    private final String direction;

    public Teacher(String name, String direction, int experience) {
        this.name = name;
        this.direction = direction;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getDirection() {
        return direction;
    }
}
