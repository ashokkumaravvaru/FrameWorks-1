package com.rameshsoft.automation.listeners;

public class StringTest {
public static void main(String[] args) {	
	String s ="   he  llo  ";
	System.out.println("1 " +s);
	String s1 = new String("RAMESHSOFT");
	System.out.println(s1);
	System.out.println(s1.charAt(3));
	String s2 = s1.concat("JAVA");
	System.out.println(s2);
	System.out.println(s2.substring(2));;
	
	System.out.println(s2.substring(3, 6));
	String s3="abc,def,ghi,jkl,mno,pqrs,tuv,wxyz";
	String[] s4=s3.split(",");
	System.out.println(s4[0]);
	for(int i=0;i<s4.length;i++)
	{
		System.out.println(s4[i]);
	}
		System.out.println(s);
		System.out.println(s.trim());
}
}






