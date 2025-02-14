package com.user.service.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		
		ApiResponse ap = new ApiResponse();
					ap.setMessage(message);
					ap.setStatus(HttpStatus.NOT_FOUND);
					ap.setSuccess(true);
					
				return new ResponseEntity<ApiResponse>(ap , HttpStatus.NOT_FOUND);
		}
	
}
