package com.hibernate.hibernatedemo;

import java.util.List;

public interface EmpService {

	List<Employee> getList();

	void setData(Employee e);

	Employee getData(int id);

	void deleteData(int id);

}
