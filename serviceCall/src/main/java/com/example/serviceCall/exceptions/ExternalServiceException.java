package com.example.serviceCall.exceptions;

import java.net.SocketTimeoutException;


public class ExternalServiceException extends SocketTimeoutException {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExternalServiceException(String message) {
      super(message);
   }
}