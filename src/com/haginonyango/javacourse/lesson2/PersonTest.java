package com.haginonyango.javacourse.lesson2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.haginonyango.javacourse.lesson10.LoggingLevel;

public class PersonTest {
	
	static final String[] MY_STATE_VALUES = {"PENING","PROCESSING","PROCESS"};

	
	private static final int PENDING = 40;
	private static final int PROCESSING = 41;
	private static final int PROCESSED = 42;
	
	public String [] states(){
		return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
	}
	@Test
	public void shouldReturnHelloWorld(){
		
		Person hagin = new Person();
		assertEquals("Hello World",hagin.helloWorld());
	}
	
	@Test
	public void shouldReturnHagin(){
		Person person = new Person();
		assertEquals("Hello Hagin", person.hello("Hagin"));
	}
	
	@Test
	public void shouldReturnNumberOfPersons(){
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		assertEquals(4, Person.numberOfPersons());
	}
	
	@Test
	public void shouldReturnNumberOfPersonsInLoop(){
		
		Person person;
		for(int i=0; i < 4; i++){
			new Person();
		}

		assertEquals(4, Person.numberOfPersons());
		
		
		int j = 0;
		while(j < 4){
			 new Person();
			j++;
		}
		assertEquals(8, Person.numberOfPersons());
		
		j = 0;
		do {
			new Person();
			j++;
		}while(j < 4);
		assertEquals(12, Person.numberOfPersons());

	}
	@Test
	public void demonstrateArrays(){
		Person[] persons = new Person[4];
		persons[0] = new Person();
		persons[1] = new Person();
		persons[2] = new Person();
		persons[3] = new Person();
		
		for(int i=0; i < persons.length; i++){
			persons[i] = new Person();
			
		}
		
		for(int i =0; i < persons.length;i++){
			persons[i] = new Person();
		}
		
		for(Person person : persons){
			person.helloWorld();
		}
		
		Person myPerson = new Person();
		Person myPerson2 = null;
		
		final Person [] persons2 = {persons[0], null, myPerson, myPerson2};

		
		String myString = "myString";
		switch(myString){
		case "":
			break;
		case "something":
			break;
		case " ":
			break;
			default:
			
		}

		for(LoggingLevel state: LoggingLevel.values()){
			
			
			if(state == (LoggingLevel.PENDING)){
				
			}
			if(state == (LoggingLevel.PROCESSED)){
				
			}
			if(state == (LoggingLevel.PROCESSED)){
				
			}
		}
	
	}
	
	@Test 
	public void demostrateBoolean(){
		
		int i = 4;
		int j = 3;
		
		boolean monday = false;
		boolean raining = true;
		
		if( shouldDrinkARX(i, j, monday, raining)){
			drinkARX();
		}
		if(i == j){
			raining = true;
		}
		
		if(monday || raining){
			i = 43;
			j= 91;
			i = i + j;
			drinkARX();
		} else if(j > i){
			i++;
			j= 56;
		} else if(i != j){
			
		}
		else {
			j--;
		}
	}
	
	private boolean shouldDrinkARX(int i, int j, boolean monday, boolean raining){
		return i < j || ((monday && !raining) || j > 3);
	}
	
	private void drinkARX(){
		/*
		 * Code for drinking ARX in here
		 */
	}
	
}
