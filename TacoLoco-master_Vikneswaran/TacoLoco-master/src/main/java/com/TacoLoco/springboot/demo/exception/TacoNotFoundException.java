package com.TacoLoco.springboot.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Item not found on our Taco Menu")
public class TacoNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TacoNotFoundException() {

	}

}  


