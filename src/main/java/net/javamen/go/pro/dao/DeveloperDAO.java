package net.javamen.go.pro.dao;

import net.javamen.go.pro.model.Developer;

import java.util.List;

/**
 * Created by Владислав on 13.05.2017.
 */
public interface DeveloperDAO {
    void addDeveloper(Developer developer);

    void updateDeveloper(Developer developer);

    void removeDeveloper(int id);

    Developer getById(int id);

    List<Developer> getListDevelopers();
}
