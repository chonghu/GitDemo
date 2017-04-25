package com.fox.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TestJava8 {

	@Test
	public void Test()
	{
		System.out.print("Hello World!");
	}
		
	
	private List<Employee> list = Arrays.asList(
		new Employee("Richard1", 23, 3333.33),
		new Employee("Richard2", 33, 3455.55),
		new Employee("Richard3", 43, 5678.99),
		new Employee("Richard4", 53, 8989.99),
		new Employee("Richard5", 18, 4532.99)
	);
	
	/**
	 * 过滤
	 * @param list
	 * @param filter
	 */
	public List<Employee> filterEmployee(List<Employee> list, Filter<Employee> filter) {
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee emp: list) {
			if (filter.test(emp)) {
				emps.add(emp);
			}
		}
		
		return emps;
	}
	
	@Test
	public void Test2() {
		list.stream().filter(p->p.getAge()> 30).forEach(System.out::println);
	}
	
	@Test
	public void Test3() {
		filterEmployee(list, (e)->e.getAge() > 50).forEach(System.out::println);;
	}
}
