package com.llamita.electrollamita.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.llamita.electrollamita.model.Cliente;

@Repository
@Transactional
public class ClienteRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Cliente> clientes(){
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Cliente.class);
		return criteria.list(); 
	}
	
	public void guardarCliente(Cliente cliente){
		Transaction tx = null;
		Session session = sessionFactory.getCurrentSession();
		try{
			tx = session.beginTransaction();
			session.saveOrUpdate(cliente);
			
			tx.commit();
		}catch(Exception e){
			try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			System.out.println("Couldn’t roll back transaction "+ rbe);
    		}
		}finally{
//			if(session!=null){
//    			session.close();
//    		}
		}
	}
	
	public Cliente findById(int idCliente){
		Session session = sessionFactory.getCurrentSession();
		return (Cliente)session.get(Cliente.class, idCliente); 
	}
	
}
