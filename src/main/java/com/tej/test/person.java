package com.tej.test;

public abstract class person {
	
	String name;
	String addrs;
	AadharDetail aadhar;
	
    public  person(String name,String addrs,AadharDetail aadhar) {
    	this.name=name;
    	this.addrs=addrs;
    	this.aadhar=aadhar;    	
    }
    
    @Override
    public String toString() {
    	return " Person Detail [" + aadhar.toString() + ",Name:->" +name+"  Address:-> "+  addrs+  " ]";
    }
}
