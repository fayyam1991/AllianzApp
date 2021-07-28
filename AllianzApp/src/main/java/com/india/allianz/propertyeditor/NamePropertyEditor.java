package com.india.allianz.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String value = capitalize(text);
		setValue(value);
	}

	private String capitalize(String value) {
		if (value == null) {
			return value;
		}
		return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
	}
}
