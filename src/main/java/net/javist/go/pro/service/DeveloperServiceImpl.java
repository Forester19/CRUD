package net.javist.go.pro.service;

import net.javist.go.pro.dao.DeveloperDAO;
import net.javist.go.pro.model.Developer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Владислав on 13.05.2017.
 */
@Service
public class DeveloperServiceImpl implements DeveloperService {

    private DeveloperDAO developerDAO;

    public void setDeveloperDAO(DeveloperDAO developerDAO) {
        this.developerDAO = developerDAO;
    }

    @Transactional
    public void addDeveloper(Developer developer) {
   developerDAO.addDeveloper(developer);
    }

    @Transactional
    public void updateDeveloper(Developer developer) {
developerDAO.updateDeveloper(developer);
    }

    @Transactional
    public void removeDeveloper(int id) {
developerDAO.removeDeveloper(id);
    }

    @Transactional
    public Developer getById(int id) {
        return developerDAO.getById(id);
    }

    @Transactional
    public List<Developer> getListDevelopers() {
        return developerDAO.getListDevelopers();
    }
}
