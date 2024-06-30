package com.tej.test;

public class AadharDetail {
	
	long aadharNo;
	int age;
	long mobileNo;
	
	public AadharDetail(long aadharNo,int age,long mobileNo) {
		this.aadharNo=aadharNo;
		this.age=age;
		this.mobileNo=mobileNo;		
	}

	@Override
	public String toString() {
		return "AadharDetail [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
