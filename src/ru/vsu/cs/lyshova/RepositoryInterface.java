package ru.vsu.cs.lyshova;

import java.util.Collection;

public interface RepositoryInterface<T> {
    T save(T entity);

    boolean findByID(int id);

    boolean deleteById(int id);

    T update(int id, T entity);

    Collection<T> findAll();
}
