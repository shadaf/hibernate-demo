package com.hibernate.hibernatedemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	private ServiceImp serviceImp;
	
	@GetMapping(value = "list", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getList(){
		return serviceImp.getList();
	}
	
	@PostMapping("save")
	public String save(@RequestBody Employee e) {
		serviceImp.setData(e);
		return "Success";
	}
	
}	
