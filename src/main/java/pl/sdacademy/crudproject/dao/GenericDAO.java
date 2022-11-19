package pl.sdacademy.crudproject.dao;

import java.util.List;

public interface GenericDAO <E>{
    List<E> findAll();

    E create(E entity);
}
