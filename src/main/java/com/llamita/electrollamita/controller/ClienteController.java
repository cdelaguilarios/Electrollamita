package com.llamita.electrollamita.controller;

import java.util.List;

import com.llamita.electrollamita.logic.ClienteService;
import com.llamita.electrollamita.model.Cliente;
import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.ClienteRepository;
import com.llamita.electrollamita.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
	
	@Autowired
    ClienteRepository clienteRepository;
	
	@Autowired
	ClienteService clienteService;

    @RequestMapping(value="/clientes", method= RequestMethod.GET)
    public String dashboard(ModelMap modelMap) {

        List<Cliente> clientes = clienteRepository.clientes();
        modelMap.addAttribute("clientes", clientes);
        
        return "/cliente/clientes";
    }
    
    @RequestMapping(value="/nuevoCliente", method= RequestMethod.GET)
    public String initFormNewClient(ModelMap modelMap) {
    	Cliente cliente = new Cliente();
    	modelMap.addAttribute("cliente", cliente);
        return "/cliente/nuevoCliente";
    }
    
    @RequestMapping(value="/nuevoCliente", method= RequestMethod.POST)
    public String newClient(final Cliente cliente, final BindingResult bindingResult, final ModelMap modelMap) {
    	if(bindingResult.hasErrors()){
    		return "/cliente/nuevoCliente";
    	}
    	clienteService.guardarCliente(cliente);
    	modelMap.clear();
    	
    	List<Cliente> clientes = clienteRepository.clientes();
        modelMap.addAttribute("clientes", clientes);
        
        return "/cliente/clientes";
    }
}
