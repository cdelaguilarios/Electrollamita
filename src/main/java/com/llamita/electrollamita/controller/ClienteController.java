package com.llamita.electrollamita.controller;

import java.util.List;

import javax.validation.Valid;

import com.llamita.electrollamita.logic.ClienteService;
import com.llamita.electrollamita.model.Cliente;
import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.ClienteRepository;
import com.llamita.electrollamita.repository.EmpresaRepository;
import com.llamita.electrollamita.util.Caster;
import com.llamita.electrollamita.view.ClienteBean;
import com.llamita.electrollamita.view.MedidorBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    	ClienteBean cliente = new ClienteBean();
    	modelMap.addAttribute("cliente", cliente);
        return "/cliente/nuevoCliente";
    }
    
    @RequestMapping(value="/nuevoCliente", method= RequestMethod.POST)
    public String newClient(@Valid @ModelAttribute("cliente") ClienteBean cliente, final BindingResult bindingResult, final ModelMap modelMap) {
    	if(bindingResult.hasErrors()){
    		return "/cliente/nuevoCliente";
    	}
    	clienteService.guardarCliente(Caster.clienteBeanCastToModel(cliente));
    	modelMap.clear();
    	
    	List<Cliente> clientes = clienteRepository.clientes();
        modelMap.addAttribute("clientes", clientes);
        
        return "/cliente/clientes";
    }
    
    @RequestMapping(value="/editCliente/{idCliente}",method=RequestMethod.GET)
    public ModelAndView initFormEditCliente(@PathVariable int idCliente){
    	ModelAndView mav  = new ModelAndView("/cliente/editCliente");
    	ClienteBean cliente = Caster.clienteModelCastToBean(clienteService.recuperarClientePorId(idCliente));
    	mav.addObject("cliente",cliente);
    	return mav;
    }
    
    @RequestMapping(value="/editCliente", method= RequestMethod.POST)
    public String editClient(@Valid @ModelAttribute("cliente") ClienteBean cliente, final BindingResult bindingResult, final ModelMap modelMap) {
    	if(bindingResult.hasErrors()){
    		return "/cliente/editCliente";
    	}
    	
    	Cliente editCliente = clienteService.recuperarClientePorId(cliente.getId());
    	clienteService.guardarCliente(Caster.clienteBeanCastToModel(cliente,editCliente));
    	modelMap.clear();
    	
    	List<Cliente> clientes = clienteRepository.clientes();
        modelMap.addAttribute("clientes", clientes);
        
        return "/cliente/clientes";
    }
    
    @RequestMapping(value="/addMedidor/{idCliente}",method=RequestMethod.GET)
    public String initFormAddMedidor(@PathVariable int idCliente,ModelMap modelMap){
    	MedidorBean medidor = new MedidorBean(); 
    	medidor.setIdCliente(idCliente);
    	modelMap.addAttribute("medidor", medidor);
    	return "/cliente/addMedidor";
    }
    
}
