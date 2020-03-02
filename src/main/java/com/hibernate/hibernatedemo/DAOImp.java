package com.hibernate.hibernatedemo;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImp implements DAO {

	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Employee> getList() {
		// TODO Auto-generated method stub
		Session current = manager.unwrap(Session.class);
		Query<Employee> query = current.createQuery("from Employee", Employee.class);
		return (List<Employee>)query.getResultList();
	}

	@Override
	public void setData(Employee e) {
		// TODO Auto-generated method stub
		Session session = manager.unwrap(Session.class);
		session.save(e);
	}

	@Override
	public Employee getData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

}
