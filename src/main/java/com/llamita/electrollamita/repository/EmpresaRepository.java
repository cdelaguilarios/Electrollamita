package com.llamita.electrollamita.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.llamita.electrollamita.model.Empresa;

@Repository
public class EmpresaRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addEmpresa(Empresa empresa){
		sessionFactory.getCurrentSession().save(empresa);
	}
	
	public List<Empresa> empresas(){
		return null;
	}

}
