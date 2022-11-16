package controller;

import enum_.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Serv;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "xd")
public class Controller {
    private final Serv service;
    @Autowired
    public Controller(Serv service) {
        this.service = service;
    }

    @GetMapping
    public ArrayList<Country> getCountryList() {
        return service.getCountryList();
    }
}
