package com.mindtree.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobelExcpetionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,
			WebRequest request){
		EmpDetails errorDetails =new EmpDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<?> handleApiException(ApiException exception,
			WebRequest request){
		EmpDetails errorDetails =new EmpDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobelException(ResourceNotFoundException exception,
			WebRequest request){
		EmpDetails errorDetails =new EmpDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
