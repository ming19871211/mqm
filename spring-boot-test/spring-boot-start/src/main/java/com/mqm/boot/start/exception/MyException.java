package com.mqm.boot.start.exception;

public class MyException extends RuntimeException {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -4643224295085607600L;
	
	 public MyException(String message) {
	        super(message);
	 }

}
