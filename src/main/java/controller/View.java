package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pojo.Country;
import service.Serv;

@RestController
public class View
{
    Serv serv=new Serv();
    @RequestMapping(path = "index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
    @RequestMapping(path = "add", method = RequestMethod.POST)
    public ModelAndView favorite(String bx) {
        ModelAndView view = new ModelAndView("add");
        Country country=serv.searchName(bx);
        try{
            view.addObject("name",country.name);
            view.addObject("area",country.area+" km^2");
            view.addObject("capital",country.capital);
            view.addObject("continent",country.continent.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
        return view;
    }
}
