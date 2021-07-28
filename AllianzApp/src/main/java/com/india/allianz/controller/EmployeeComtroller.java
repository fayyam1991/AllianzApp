package com.india.allianz.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.india.allianz.User;
import com.india.allianz.model.ResponseEntity;
import com.india.allianz.propertyeditor.NamePropertyEditor;
import com.india.allianz.service.DefaultEmployeeService;
import com.india.allianz.validator.EmployeeValidator;

@Controller
@RequestMapping("/addEmployee.html")
public class EmployeeComtroller extends AbstractController {

	@Autowired
	private DefaultEmployeeService employeeService;

	private static final String[] FILEDS = new String[] { "name", "phone", "email", "attachment", "date" };
	private static final String[] REQ_FIELDS = new String[] { "name", "phone", "email", "date" };

	@RequestMapping(method = RequestMethod.GET)
	public String setUpForm() {
		return "home";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView home(@ModelAttribute User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("allianz-error");
		}
		ResponseEntity responseEntity = employeeService.addEmployee(user);
		if (responseEntity.isOk()) {
			return new ModelAndView("home");
		}

		ModelAndView vm = new ModelAndView("allianz-error");
		return vm;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		super.initBinder(binder);
		binder.setAllowedFields(FILEDS);
		binder.setRequiredFields(REQ_FIELDS);
		
		binder.setValidator(new EmployeeValidator());
		binder.validate();

		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyy-MM-dd"), false));
		binder.registerCustomEditor(String.class, "name", new NamePropertyEditor());
	}
}
