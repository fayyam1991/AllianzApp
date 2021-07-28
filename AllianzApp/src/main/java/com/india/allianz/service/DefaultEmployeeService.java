package com.india.allianz.service;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.india.allianz.User;
import com.india.allianz.exception.AllianzException;
import com.india.allianz.model.ResponseEntity;

@Service
public class DefaultEmployeeService implements EmployeeService{

	@Override
	public ResponseEntity addEmployee(User user) {
		return new ResponseEntity(HttpStatus.OK, "success");
		
	}

	@Override
	public void deleteEmployee(String id) {
		throw new AllianzException("Not implemented");
		
	}

	@Override
	public void editEmployee(User user) {
		throw new AllianzException("Not implemented");
		
	}

}
