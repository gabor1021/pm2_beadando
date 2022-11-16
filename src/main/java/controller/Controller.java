package controller;

import country.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Serv;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "xd")
public class Controller {
    Serv service;

    @GetMapping
    public ArrayList<Country> xd() {
        return service.XML("src/main/resources/data.xml");
    }
}
