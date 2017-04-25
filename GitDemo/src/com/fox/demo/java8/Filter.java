package com.fox.demo.java8;

public interface Filter<T> {
	public boolean test(T t);
}
