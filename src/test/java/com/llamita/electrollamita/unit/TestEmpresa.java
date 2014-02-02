package com.llamita.electrollamita.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.EmpresaRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/electrollamita-applicationcontext.xml", 
                                    "/electrollamita-hibernate.xml" ,
                                    "/electrollamita-servlet.xml"})
public class TestEmpresa {

	private EmpresaRepository empresaRepository;
	
	@Autowired
	public void setRepositoryEmpresa(EmpresaRepository empresaRepository){
		this.empresaRepository = empresaRepository;
	}
	
	@Test
	public void crearEmpresa(){
		System.out.println("Test: Crear Empresa !!");
		
		try{
			
			Empresa empresa = new Empresa();
			empresa.setUsuario("Llamita");
			empresa.setContrasena("llamita");
			empresa.setRazonSocial("Como La Llamita");
			empresa.setRuc("1111111111111");
			
//			empresaRepository.addEmpresa(empresa);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
