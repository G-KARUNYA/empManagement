package com.imaginnovate.task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptiont extends RuntimeException {
	
	
	public ResourceNotFoundExceptiont(String msg) {
		super(msg);
	}


}
