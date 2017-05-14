package net.javamen.go.pro.controller;

import net.javamen.go.pro.model.Developer;
import net.javamen.go.pro.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Владислав on 13.05.2017.
 */
@Controller
public class DeveloperController {
private DeveloperService developerService;



     @Autowired(required = true)
 public void setDeveloperService(DeveloperService developerService) {
        this.developerService = developerService;
    }

   /* @RequestMapping(value = "developers",method = RequestMethod.GET)
    public String listDevelopers(Model model){
         model.addAllAttributes("developer", new Developer());
         model.addAllAttributes("listDevelopers", developerService.getListDevelopers());

         return "developers";
    }*/
}
