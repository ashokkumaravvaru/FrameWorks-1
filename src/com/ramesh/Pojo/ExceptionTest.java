package com.ramesh.Pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
public static void main(String[] args) throws FileNotFoundException {
	System.out.println("a");
	FileInputStream fip = new FileInputStream("D://abc.txt");
	System.out.println("b");
	System.out.println("c");
	System.out.println("d");
}
}
