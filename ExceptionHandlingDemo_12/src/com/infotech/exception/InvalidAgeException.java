package com.infotech.exception;

public class InvalidAgeException extends RuntimeException {

	private static final long serialVersionUID = 4789408015562670781L;
	private int age;
	
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(int age) {
		this.age = age;
	}
	public InvalidAgeException(String msg, int age) {
		super(msg);
		this.age = age;
	}
	public InvalidAgeException(String msg, Throwable cause, int age) {
		super(msg, cause);
		this.age = age;
	}
	@Override
	public String toString() {
		return "InvalidAgeException for Age: " + getAge();
	}
	@Override
	public String getMessage() {
		return "InvalidAgeException for Age: " + getAge();
	}
	public int getAge() {
		return age;
	}
}
