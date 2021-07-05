package com.example.serviceCall.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	
	
	@ExceptionHandler(ExternalServiceException.class)
	public ResponseEntity<ExceptionResponse> customTimeoutException(ExternalServiceException ex) {
		ExceptionResponse errorObj = new ExceptionResponse();
		errorObj.setErrorCode(HttpStatus.REQUEST_TIMEOUT.value());
		errorObj.setErrorMsg(ex.getMessage());

		return new ResponseEntity<ExceptionResponse>(errorObj, HttpStatus.REQUEST_TIMEOUT);
	}
}
