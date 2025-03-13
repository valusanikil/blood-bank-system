package com.bb.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(InvalidException.class)
	public String InvalidExceptionHandler(InvalidException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(NoDataFoundException.class)
	public String handleNoDataFoundException(NoDataFoundException ex) {
		return ex.getMessage();
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String, String> map=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(
				(error)->{
					map.put(error.getField(), error.getDefaultMessage());
				});
		
		return map;
	}
}
