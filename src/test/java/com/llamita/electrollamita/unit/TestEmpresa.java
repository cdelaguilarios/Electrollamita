package com.llamita.electrollamita.unit;

import org.junit.Test;

import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.EmpresaRepository;

public class TestEmpresa {

	@Test
	public void crearEmpresa(){
		System.out.println("Test: Crear Empresa !!");
		
		Empresa empresa = new Empresa();
		empresa.setUsuario("Llamita");
		empresa.setContrasena("llamita");
		empresa.setRazonSocial("Como La Llamita");
		empresa.setRuc("1111111111111");
		
		
		
	}
	
}
