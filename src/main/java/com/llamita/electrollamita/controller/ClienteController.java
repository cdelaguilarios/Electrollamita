package com.llamita.electrollamita.controller;

import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
	@Autowired
    EmpresaRepository empresaRepository;

    @RequestMapping(value="/clientes", method= RequestMethod.GET)
    public String dashboard(ModelMap modelMap) {

        Empresa emp = empresaRepository.empresas();
        modelMap.addAttribute("empresa", emp);
        return "clientes";
    }
}
