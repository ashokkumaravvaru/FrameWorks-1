package com.rameshsoft.businessScript;

//it is aclass it is have common business servicess across project
class CommonServices
{
	public void login() {
		System.out.println("login");
	}
	public void logout() {
		System.out.println("logout");
	}
}

class InheritOne extends CommonServices
{
	public void kids() {
		System.out.println("kids");
	}
	public void men() {
		System.out.println("men");
	}
}
class InheritTwo extends CommonServices
{
	public void electronics() {
		System.out.println("electronics");
	}
}

public class TestOnee {

public static void main(String[] args) {
	//1. parent class object
	CommonServices c = new CommonServices();
	c.login();
	c.logout();
	
	//2. child class object
	InheritOne i = new InheritOne();
	i.login();
	i.logout();
	i.kids();
	i.men();
	
	//child class object
	InheritTwo i1 = new InheritTwo();
	i1.login();
	i1.logout();
	i1.electronics();
	
	
	//3. child class object using parent class reference
	CommonServices c1 = new InheritOne();
	c1.login();
	c1.logout();
	//c1.men();
	//c1.kids();
	
	//4. as off now it is not possible ie by using child class reference we
	//can not create parent class object
	//InheritOne i2 = new CommonServices();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}


















