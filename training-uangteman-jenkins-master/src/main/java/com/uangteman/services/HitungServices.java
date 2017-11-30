package com.uangteman.services;

import org.springframework.stereotype.Service;

@Service("HitungServices")
public class HitungServices {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiple(int a, int b) {
		return a*b;
	}
	
	public float divide(int a, int b) {
		return a/b;
	}
}
