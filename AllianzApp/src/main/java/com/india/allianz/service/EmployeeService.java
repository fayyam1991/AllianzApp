package com.india.allianz.service;

import com.india.allianz.User;
import com.india.allianz.model.ResponseEntity;

public interface EmployeeService {
	ResponseEntity addEmployee(User user);
	void deleteEmployee(String id);
	void editEmployee(User user);
}
