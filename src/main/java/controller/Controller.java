package controller;

import enum_.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import service.Serv;

import java.util.ArrayList;

@RestController
public class Controller {
    private Serv service;

    @RequestMapping(path = "list", method = RequestMethod.GET)
    public ArrayList<Country> getCountryList() {
        return service.XML("src/main/resources/xml/data.xml");
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView view() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
