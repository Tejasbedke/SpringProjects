package com.tej.test;

public class Student extends person {
	
	double fee;
	String course;
	
	public Student(String name,String addrs,AadharDetail aadhar,double fee,String course) {
		super(name,addrs,aadhar);
        this.fee=fee;
        this.course=course;
		
	}

	@Override
	public String toString() {
		return "Student "+super.toString()+"[fee="+ fee + ", course=" + course + "]";
	}
	

}
