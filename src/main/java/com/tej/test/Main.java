package com.tej.test;

public class Main {

	public static void main(String[] args) {
		AadharDetail aadhar=new AadharDetail(12345,20, 897515);
		Student student=new Student("Tejas","Chatrapati Sambhajinagar",aadhar,3500,"core java");
		System.out.println(student);
		

	}

}
