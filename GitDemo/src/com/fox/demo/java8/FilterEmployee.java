package com.fox.demo.java8;

public class FilterEmployee implements Filter<Employee> {


	@Override
	public boolean test(Employee employee) {
		// TODO Auto-generated method stub
		return (employee.getAge() > 30);
	}

}
