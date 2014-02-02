package com.llamita.electrollamita.controller;

import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Salas Millones on 02/02/14.
 */

@Controller
public class MainController {

    @Autowired
    EmpresaRepository empresaRepository;

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String dashboard(ModelMap modelMap) {

        Empresa emp = empresaRepository.empresas();
        modelMap.addAttribute("empresa", emp);
        return "index";
    }


}
