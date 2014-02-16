package com.llamita.electrollamita.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llamita.electrollamita.model.Cliente;
import com.llamita.electrollamita.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public void guardarCliente(Cliente cliente){
		cliente.setIdEmpresa(new Integer(1));
		cliente.setEstado('1');
		clienteRepository.guardarCliente(cliente);
	}
	
}
