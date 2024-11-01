package ru.vsu.cs.lyshova;

import java.util.*;

public class Repository<T> implements RepositoryInterface<T> {
    private Map<Integer, T> database = new HashMap<>();
    private List<Integer> deletedIndexes = new ArrayList<>();
    private int maxId = 0;

    public Repository() {}

    @Override
    public T save(T obj) {
        int tempId = maxId;
        if (!deletedIndexes.isEmpty()) {
            tempId = deletedIndexes.getFirst();
            deletedIndexes.removeFirst();
        }

        database.put(tempId, obj);
        if (Objects.equals(tempId, maxId)) {
            maxId++;
        }

        return obj;
    }

    @Override
    public boolean findByID(int id) {
        try {
            return database.get(id) != null;
        } catch (Exception ex) {
            System.out.println("Invalid ID!");
            return false;
        }
    }

    @Override
    public T update(int id, T obj) {
        database.put(id, obj);
        return obj;
    }

    @Override
    public Collection<T> findAll() {
        return database.values();
    }

    @Override
    public boolean deleteById(int id) {
        try {
            database.remove(id);
            deletedIndexes.add(id);
            return true;
        } catch (Exception ex) {
            System.out.println("Invalid ID!");
            return false;
        }
    }

    public Map<Integer, T> getDatabase() {
        return database;
    }
}
