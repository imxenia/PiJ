package ru.vsu.cs.lyshova;

import ru.vsu.cs.lyshova.objects.Group;
import ru.vsu.cs.lyshova.objects.Pupil;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static Repository<Group> groupRepository = new Repository<>();
    private static Repository<Pupil> pupilRepository = new Repository<>();

    public Controller() {
    }

    public Group addGroup(int number, String direction, String formEducation) {
        return groupRepository.save(new Group(number, direction, formEducation));
    }

    public Pupil addPupil(String name, int groupId, String number) {
        if (groupRepository.findByID(groupId)) {
            return pupilRepository.save(new Pupil(name, groupId, number));
        } else {
            throw new RuntimeException("Group does not exist");
        }
    }

    public List<Pupil> getAllPupils() {
        return new ArrayList<>(pupilRepository.findAll());
    }

    public List<Group> getAllGroup() {
        return new ArrayList<>(groupRepository.findAll());
    }
}