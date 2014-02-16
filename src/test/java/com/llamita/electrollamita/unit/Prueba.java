package com.llamita.electrollamita.unit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.llamita.electrollamita.model.Empresa;
import com.llamita.electrollamita.repository.EmpresaRepository;

public class Prueba {

	public static void main(String[] args){
		
		try{
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]
					{"electrollamita-applicationcontext.xml",
					 "electrollamita-servlet.xml"});
	 
			EmpresaRepository repository = (EmpresaRepository) context.getBean("empresaRepository");
			
			Empresa empresa = new Empresa();
			empresa.setId(1);
			empresa.setRazonSocial("Aomine");
			empresa.setRuc("1111122111");
			
			repository.addEmpresa(empresa);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
