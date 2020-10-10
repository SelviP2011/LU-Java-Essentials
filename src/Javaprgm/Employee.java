package Javaprgm;

public class Employee {
	String a,c;int b;
	Employee(String name,int age,String city){
		a=name;
		b=age;
		c=city;
	}
	public void display(){
		System.out.print("The name is "+a);
		System.out.print(" whose age is "+b);
		System.out.println(" lives in "+c+".");
	}

}
