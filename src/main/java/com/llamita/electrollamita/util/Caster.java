package com.llamita.electrollamita.util;

import com.llamita.electrollamita.model.Cliente;
import com.llamita.electrollamita.view.ClienteBean;

public class Caster {

	public static Cliente clienteBeanCastToModel(ClienteBean cliente){
		Cliente model = new Cliente();
		model.setRazonSocial(cliente.getRazonSocial());
		model.setRuc(cliente.getRuc());
		model.setDireccion(cliente.getDireccion());
		model.setTelefono(cliente.getTelefono());
		model.setEstado('1');
		model.setIdEmpresa(new Integer(1));
		return model;
	}
	
	public static ClienteBean clienteModelCastToBean(Cliente cliente){
		ClienteBean bean = new ClienteBean();
		bean.setId(cliente.getId());
		bean.setDireccion(cliente.getDireccion());
		bean.setRazonSocial(cliente.getRazonSocial());
		bean.setRuc(cliente.getRuc());
		bean.setTelefono(cliente.getTelefono());
		return bean;
	}
	
	public static Cliente clienteBeanCastToModel(ClienteBean cliente,Cliente model){
		model.setRazonSocial(cliente.getRazonSocial());
		model.setRuc(cliente.getRuc());
		model.setDireccion(cliente.getDireccion());
		model.setTelefono(cliente.getTelefono());
		return model;
	}
	
}
