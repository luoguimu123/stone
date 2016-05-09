package com.pcncad.lgm.chap6;

public interface Environment {

	void put(String name, Object value);
	
	Object get(String name);
	
}
