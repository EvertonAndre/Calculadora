package com.senac.ead.Calculadora.exceptions;

import java.io.Serializable;
import java.util.Date;


public class Exceptions implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	private Date timestamp;
	private String message;
	private String details;
	
	public Exceptions(Date timestamp, String message, String details) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
