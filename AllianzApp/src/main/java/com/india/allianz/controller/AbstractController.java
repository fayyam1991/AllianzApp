package com.india.allianz.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.india.allianz.propertyeditor.AllianzBindErrorProcessor;

public class AbstractController {

	protected AllianzBindErrorProcessor errorProcessor = new AllianzBindErrorProcessor();

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setBindingErrorProcessor(errorProcessor);
	}
}
