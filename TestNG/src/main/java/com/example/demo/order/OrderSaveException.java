package com.example.demo.order;

public class OrderSaveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public OrderSaveException(){}
	
	public OrderSaveException(String message){
		super(message);
	}
	
}