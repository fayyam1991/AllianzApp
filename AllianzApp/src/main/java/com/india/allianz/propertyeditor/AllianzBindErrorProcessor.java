package com.india.allianz.propertyeditor;

import java.nio.file.AccessDeniedException;

import org.springframework.beans.PropertyAccessException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DefaultBindingErrorProcessor;
import org.springframework.validation.ObjectError;

public class AllianzBindErrorProcessor extends DefaultBindingErrorProcessor {
	@Override
	public void processPropertyAccessException(PropertyAccessException ex, BindingResult bindingResult) {

		if (ex.getCause() instanceof AccessDeniedException) {
			AccessDeniedException accessDeniedException = (AccessDeniedException) ex.getCause();
			handleAccessDeniedException(accessDeniedException, bindingResult);
		}
		super.processPropertyAccessException(ex, bindingResult);
	}

	private void handleAccessDeniedException(AccessDeniedException exception, BindingResult bindingResult) {
		bindingResult.addError(new ObjectError("Security voilation", exception.getMessage()));
	}
}
