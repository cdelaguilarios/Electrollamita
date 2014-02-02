package com.llamita.electrollamita.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.llamita.electrollamita.repository.EmpresaRepository;

public class Prueba {

	public static void main(String[] args){
		
		try{
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]
					{"electrollamita-applicationcontext.xml",
					"electrollamita-hibernate.xml","electrollamita-thymeleaf.xml","electrollamita-servlet.xml"});
	 
			EmpresaRepository repository = (EmpresaRepository) context.getBean("empresaRepository");
			
			Empresa empresa = new Empresa();
			empresa.setId(1);
			empresa.setUsuario("Llamita");
			empresa.setContrasena("llamita");
			empresa.setRazonSocial("Como La Llamita");
			empresa.setRuc("1111111111");
			
			repository.addEmpresa(empresa);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
