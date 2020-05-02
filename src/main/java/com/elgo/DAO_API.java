package com.elgo;

import java.util.List;
import java.util.Optional;

public interface DAO_API<T> {
    //Optional est pour éviter d'utiliser explicitement null
    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}
