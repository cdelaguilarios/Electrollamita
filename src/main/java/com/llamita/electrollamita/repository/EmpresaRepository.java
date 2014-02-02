package com.llamita.electrollamita.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.llamita.electrollamita.model.Empresa;

@Repository
@Transactional
public class EmpresaRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addEmpresa(Empresa empresa){
		try{
		    Session session = sessionFactory.getCurrentSession();
		    Transaction trans =(Transaction) session.beginTransaction();
		    session.save(empresa);
		    trans.commit();
		}catch(Exception e){
	    	e.printStackTrace();
	    }
	}

	public Empresa empresas() {

        Session session = sessionFactory.getCurrentSession();
        return (Empresa)session.get(Empresa.class, 1);
	}

}
