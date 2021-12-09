package com.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware
{
	private int empId;
	private String empName;
	private Address address;
	
	public Employee()
	{
		System.out.println("This is Constructor of Employee");
	}
	/*public Employee(String empName,int empId, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}*/

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void greet(String message)
	{
		System.out.println(message);
	}
	
	public void myinitmethod()
	{
		System.out.println("This is myInit Method");
	}
	
	public void myDestroymethod()
	{
		System.out.println("This is myDestroy Method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is called After Properties are set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy method!!!");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName:  This is the bean Name:-"+arg0);
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactory Aware:-"+ arg0);
		
	}
}
