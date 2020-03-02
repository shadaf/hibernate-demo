package com.hibernate.hibernatedemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImp implements EmpService {

	
	@Autowired
	private DAOImp dao;
	
	@Transactional
	@Override
	public List<Employee> getList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}

	@Transactional
	@Override
	public void setData(Employee e) {
		dao.setData(e);
		
	}

	@Transactional
	@Override
	public Employee getData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

}
