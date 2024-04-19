package com.javaweb.controlleradivce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.javaweb.DTO.ErrorResponseDTO;
import com.javaweb.customeexception.FieldRequireException;

@ControllerAdvice
public class ControllerAdvisor {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {
		ErrorResponseDTO er = new ErrorResponseDTO();
		List<String> detail = new ArrayList<String>();
		detail.add("lam sao co the chia cho so 0 duoc");
		er.setDetail(detail);
		return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(FieldRequireException.class)
	public ResponseEntity<Object> handleFieldRequireException(FieldRequireException ex, WebRequest request) {
		ErrorResponseDTO er = new ErrorResponseDTO();
		List<String> detail = new ArrayList<String>();
		detail.add("Name or District is not push");
		er.setDetail(detail);
		return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
	}

}
