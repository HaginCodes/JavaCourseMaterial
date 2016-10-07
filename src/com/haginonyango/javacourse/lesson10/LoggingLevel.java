package com.haginonyango.javacourse.lesson10;

public enum LoggingLevel {
	PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, "");
	
	private int i;
	private String s;
	
	LoggingLevel(int i, String s ){
		this.i = i;
		this.s = s;
	}
	
	public String SomeString(){
		return "";
	}
	public int code(){
		return i; 
	}
	
	public boolean isPending(){
		
		return this == PENDING;
	}
}
