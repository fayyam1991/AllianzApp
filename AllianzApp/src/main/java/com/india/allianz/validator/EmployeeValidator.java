package com.india.allianz.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.india.allianz.User;

public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		System.out.println(user);
	}

}
