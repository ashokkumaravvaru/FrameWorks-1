package com.rameshsoft.automation.listeners;

public class TestOnee {

	String name;
	public TestOnee(String name){
		this.name=name;
	}
	@Override
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) {
		
		TestOnee t = new TestOnee("RAMESHSOFT");
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println("hash code is : " +t.hashCode());
		
		TestOnee t1 = new TestOnee("JAVA");
		System.out.println("hash code is : " +t1.hashCode());
		
	}
	
}


