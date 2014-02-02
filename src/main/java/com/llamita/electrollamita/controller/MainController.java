package com.llamita.electrollamita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Salas Millones on 02/02/14.
 */

@Controller
public class MainController {

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String dashboard(ModelMap modelMap) {
        return "index";
    }


}
